// Here we write a program for to make the first letter of ever word be capital letter 
package StringBuilder;

public class FirstLetterUppecaseOfEveryWord {
    public static String Uppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char a = Character.toUpperCase(str.charAt(0));
        sb.append(a);
        for(int i = 1; i< str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str= "my name is sahil vishwakarma i am study at at aks university";
        System.out.print(Uppercase(str));
    }
}
