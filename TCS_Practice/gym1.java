package TCS_Practice;
import java.util.*;
public class gym1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the month:");
        int month = sc.nextInt();
        sc.close();
        int fees;
        switch(month) {
            case 1:
                fees = 2000;
                break;
            case 3:
                fees = 5000;
                break;
            case 6:
                fees = 9000;
                break;
            case 9:
                fees = 12000;
                break;
            case 12:
                fees = 15000;
                break;
            default:
                fees = 0;
        }
        System.out.println(fees);
    }
}
