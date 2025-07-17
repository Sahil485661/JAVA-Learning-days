//Write a function to print the sum of all odd numbers from 1 to n.
package Function;
import java.util.*;
public class sumOfAllOddNumber {
    public static int OddSum(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if(i%2 != 0){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        OddSum(a);
        System.out.println("Sum of All Odd Number is " +OddSum(a));
        sc.close();
        }
    }

