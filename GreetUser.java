import java.util.*;
public class GreetUser
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        System.out.println("Hello Welcome " +name + "!");
    }
    
}
