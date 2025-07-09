import java.util.*;
public class InputAddition
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("Addition " + (a + b));
        System.out.println("Subtration " + (a-b));
        System.out.println("Multiplication " + (a * b));
        if(b!= 0){
        System.out.println("Division " + (a / b));
        System.out.println("Modulus " + (a % b));
        }
        else {
            System.out.println("Division by zeo is not possible");
            System.out.println("Modulus by zero is not possible");
        }
        System.out.println("Pre Increement " + (++a));
        System.out.println("Post Increement " + (a++));
        System.out.println("Pre Decreement " + (--b));
        System.out.println("Post Decreement " + (b--));

    }
}
