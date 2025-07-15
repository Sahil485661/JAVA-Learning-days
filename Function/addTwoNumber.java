package Function;
import java.util.*;

public class addTwoNumber {
    public static int Addition(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = Addition(a, b);
        System.out.print("Sum of the two numbers: " +add);
        sc.close();
    }
}
