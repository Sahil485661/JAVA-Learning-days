//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 21 .....

package Function;
import java.util.*;
public class fibonacciseries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for fibonacci series: ");
        int a = sc.nextInt();
        int b = 0;
        int c = 1;
        sc.close();
        System.out.print(b);  //First we need to print first TWo values that are always print
        System.out.print("," +c);
        for(int i = 1; i <= a-2; i++){
            int d = c+b;
            b = c;
            c = d;
            System.out.print(","+d);
        }
    }
}
