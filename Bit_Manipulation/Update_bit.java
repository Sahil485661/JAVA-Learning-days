package Bit_Manipulation;

import java.util.Scanner;

public class Update_bit {
    public static int Clear(int n, int position ){      //Clear means targeted bit change into 0
        int bitmask = ~(1<<position);       //~ this is compliment means it is change 0 to 1 and 1 to 0
        // means if we have ~(001010) = 110101 this thing is doing above line
        // Now we perform & opration 
        return n & bitmask;
    }
    public static int Set(int n, int position ){        //Set means targeted bit change into 1
        int bitmask = 1<< position;
        return n | bitmask;
    }
    public static int Update(int n, int position, int newBit ){
        if(newBit == 0){
           return Clear(n, position);
        }
        else{
           return Set(n, position);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to change the bit: ");
        int n = sc.nextInt();
        System.out.println("Enter the bit changing position (0 means 1st place):");
        int position = sc.nextInt();
        System.out.println("Enter what value put here(0 or 1):");
        int newBit = sc.nextInt();
        sc.close();
        System.out.println("Before changes:" +Integer.toBinaryString(n));
        System.out.println("Here is your Output After Change:" + Integer.toBinaryString(Update(n, position, newBit)));

    }
}
