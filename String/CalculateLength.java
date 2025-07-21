//Write a program to calculate the length of String.
//ex: Sahil is string then the length is 5
package String;

import java.util.Scanner;

public class CalculateLength {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentences:");
        String Sentence = sc.nextLine();        //It is also count the space in string
        sc.close();
        System.out.print("Length of String:"+Sentence.length());

    }
}
