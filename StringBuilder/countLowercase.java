package StringBuilder;

public class countLowercase {
    public static int lower(String sb){
        int count= 0;
        for(int i = 0; i<sb.length(); i++){
           if(Character.isLowerCase(sb.charAt(i))){
            count++;
        }
    }
        return count;
    }
    public static void main(String args[]){
        String sb = "He saal insaan";
        System.out.println(lower(sb));
    }
}
