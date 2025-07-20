//Take a matrix as input from the user. Search for  a given number x and print the indices at which it occurs.
package Twod_Array;
import java.util.*;
public class Search_TheGivenNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter column: ");
        int column = sc.nextInt();
        int num[][] = new int[rows][column];
        for(int i = 0;i < rows;i++){
            for(int j = 0; j < column;j++){
                num[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter searching Number: ");
        int x = sc.nextInt();
        sc.close();
        for(int i = 0 ; i< rows;i++){
            for(int j = 0;j< column; j++){
                if(x == num[i][j]){
                    System.out.println("The given "+x +" Number is stored in " +"{" +i +"," +j +"}");
                }
            }
        }
    }
}
