//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.
package Function;
import java.util.*;
public class xN{
    public static int f(int x, int n){
        int z = 1;
        if(n==0){       //control 0 input
            z = 1;
        }
        for(int i = 1; i<= n; i++){         //loop for running multiple time
            z = z*x;
        }
        return (z);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which power want to calculate: ");
        int x = sc.nextInt();
        System.out.println("Enter the power value which you want:");
        int n = sc.nextInt();
        f(x,n);
        sc.close();
        System.out.println("So After the calculation Power of " +x +"^" +n +" number is: " +f(x,n));
    }
}
