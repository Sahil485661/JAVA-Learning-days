package String;

import java.util.Scanner;

public class Concatenation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String FirstName = sc.next();
        String LastName = sc.next();
        sc.close();
        //Concatenation
        String FullName = FirstName +"@" +LastName;  //@ will be not stored any where
        System.out.println(FullName);
    }
}
