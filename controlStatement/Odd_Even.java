package controlStatement;
import java.util.*;
public class Odd_Even {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check the number is even or odd: ");
        int a = sc.nextInt();
        sc.close();
        if (a%2 == 0)
        {
            System.out.print("The " +a +" Number is Even ");
        }
        else
        {
            System.out.print("The " +a +" Number is Odd");
        }

}
}