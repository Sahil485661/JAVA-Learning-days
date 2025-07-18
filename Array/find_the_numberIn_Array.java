//Take an array as input from the user.  Search for a given number x and print the index at which it occurs.
//This question is giving the knowlegde about linear search 
package Array;

import java.util.Scanner;

public class find_the_numberIn_Array {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        System.out.println("Enter the value in array");
        int number[] = new int[size];

        //input loop
        for(int i = 0;i < size;i++){
            number[i] =  sc.nextInt();
        }

        //here we take the targeted number
        System.out.print("Enter the the number which you want to search: ");
        int x = sc.nextInt();
        boolean found = false;      //this is check the value is found or not if found then break the loop
        sc.close();

        //here we create a loop for searching the targeed number
        for(int i = 0; i< number.length;i++){
            //this if is search the targeted value 
            if(x== number[i]){
                System.out.println("Your " +x +" Number is stored in " +i);
                found = true;
                break;
            }
        }
        if(found == false){
                System.out.println("Your targeted number is not found!");
            }
    }
}
