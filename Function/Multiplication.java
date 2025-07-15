package Function;
import java.util.*;

public class Multiplication {
    public static int Multiply(int a, int b){
        int c = a*b;
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int guna = Multiply(a, b);
        System.out.print("Multiplication of Two numbers: " +guna);
        sc.close();
    }
}
