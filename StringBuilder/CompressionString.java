// String Compression in java
package StringBuilder;

public class CompressionString {
    public static void Compre(String sb){
        StringBuilder ab = new StringBuilder("");
        for(int i = 0; i<sb.length(); i++){
            Integer count = 1;
            while(i< sb.length()-1 && sb.charAt(i) == sb.charAt(i+1)){
                count++;
                i++;
            }
            ab.append(sb.charAt(i));
            if(count> 1){
                ab.append(Integer.toString(count));
            }
        }
        System.out.print(ab);

    }
    public static void main(String args[]){
        String sb = "aabbshdaaas";
        Compre(sb);
    }
}
