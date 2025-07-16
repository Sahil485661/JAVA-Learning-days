package Function;
import java.util.*;

public class MultiplicationinShort {
    public static double Multiply(Double a,Double b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        Multiply(a,b);
        System.out.print("Product of two numbers: " +Multiply(a,b));
        sc.close();
    }
}
