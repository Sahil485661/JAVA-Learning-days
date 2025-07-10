package controlStatement;
import java.util.*;
public class switchuse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.println("Please choose the Operation(+, -, /, *): ");
        String Operation = sc.next();
        int Result = 0;
        sc.close();
        switch (Operation)
        {
            case "+":
                Result = a + b;
                System.out.print("Addition of values is: " + Result);
            break;
            case "*":
                Result = a * b;
                System.out.print("Multiplication of values is: " + Result);
            break;
            case "/":
                if( b != 0)
                {
                    Result = a / b;
                    System.out.print("Division of values is: " + Result);
                }
                else 
                {
                    System.out.print("Second input is not should be zero");
                }
                break;
            case "-":
                Result = a - b;
                System.out.print("Subtraction of values is: " + Result);
            break;
            default:
                System.out.println("Please input vaid statement");
                break;
        }
            
    }

}
