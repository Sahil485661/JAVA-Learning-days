package controlStatement;
import java.util.*;
public class N_natural_number_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = 0;
        for(int i = 1; i<=n; i++){
            z = z + i;
        }
        sc.close();
        System.out.print("Sum of N natural number is: " +z);
    }
    
}
