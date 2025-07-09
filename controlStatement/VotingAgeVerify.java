package controlStatement;
import java.util.*;

public class VotingAgeVerify 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        sc.close();
        if(age>=18)
        {
            System.out.print("You are Eligible for voting in India");
        }
        else
        {
            System.out.print("you are not eligible for voting in India");
        }
    }   
}
