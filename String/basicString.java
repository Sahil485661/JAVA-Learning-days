package String;
import java.util.*;
public class basicString {
    public static void main(String args[]){
        System.out.println("Enter your name here:");
        Scanner sc = new Scanner(System.in);
        String basic = sc.nextLine();
        sc.close();
        System.out.println("Your name is "+basic);
    }
}
