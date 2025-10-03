package Bit_Manipulation.Practice;

import java.util.Scanner;

public class practiceget {
    public static  void bit(int num, int bitmask){
        System.out.print(Integer.toBinaryString(num & bitmask));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which bit want to know");
        int num = sc.nextInt();
        System.out.println("Enter the ith position of number which want to know");
        int Position = sc.nextInt();
        sc.close();
        int bitmask = 1<<Position;
        bit(num, bitmask);
    }
}
