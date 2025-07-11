package controlStatement;
import java.util.*;
public class print_table_for_loop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1; i<=10; i++){
            
            System.out.println(a * i);
        }
        sc.close();
    }
    
}
