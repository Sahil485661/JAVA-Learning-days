package TCS_Practice;

import java.util.*;

public class Gym
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month:");
        int month = sc.nextInt();
        sc.close();
        int fee;
        if (month == 1) {
            fee = 2000;
        } else if (month == 3) {
            fee = 5000;
        } else if (month == 6) {
            fee = 9000;
        } else if (month == 9) {
            fee = 12000;
        } else if (month == 12) {
            fee = 15000;
        } else
            fee = 0;
        System.out.println(fee);
    }
}
