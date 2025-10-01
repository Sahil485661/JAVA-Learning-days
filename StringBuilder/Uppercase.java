package StringBuilder;

import java.util.Scanner;


public class Uppercase {
    public static void upper(String sb){
        StringBuilder ab = new StringBuilder("");
        char a = Character.toUpperCase(sb.charAt(0));
        ab.append(a);
        for(int i = 1 ; i< sb.length(); i++){
            if(sb.charAt(i) == ' ' && i < sb.length()-1){
                ab.append(sb.charAt(i));
                i++;
                ab.append(Character.toUpperCase(sb.charAt(i)));
                
            }
            else{
                ab.append(sb.charAt(i));
            }
        }
        System.out.println(ab);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sb = sc.nextLine();
        sc.close();
        upper(sb);
    }
}
