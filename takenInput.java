import java.util.*;
public class takenInput {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // Read full word input
        sc.close(); // Close the scanner to prevent resource leaks
        System.out.println(name);
    }
}
