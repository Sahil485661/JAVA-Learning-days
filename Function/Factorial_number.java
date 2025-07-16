package Function;
import java.util.*;
public class Factorial_number {
    public static int factorial(int n){
        if(n <= 0){
            System.out.println("This number can't give the factorial Number ");
            return -1;
        }
        int fact = 1;
        for(int i=n ; i>= 1; i--){
            fact = fact * i;
        }
       return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        factorial(a);
        System.out.println("factorial of the number is " +factorial(a));
        sc.close();
    }
}
