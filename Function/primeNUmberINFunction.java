package Function;
import java.util.*;

public class primeNUmberINFunction{
    public static int prime(int x){
        int count = 0;
        int check = 0;
        for(int i = 2; i <= x; i++){
            for(int j = 2; j<=Math.sqrt(i);j++){         //Math.sqrt is the efficient way another way is j<i
                if(i%j==0){
                    count ++;
                }
            }
            if(count==0) {
                System.out.println(i);
                check++;
            }
            else count = 0;
        }
        return check;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till where you want to print the Prime Number:");
        int num = sc.nextInt();
        sc.close();
        int Result= prime(num);
        System.out.println("Total printed Prime number is: "+Result);

    }
}