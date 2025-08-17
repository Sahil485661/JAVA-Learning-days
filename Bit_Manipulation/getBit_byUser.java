// ISme get bit me user ko pata chalta hai ki diye gaye number ke pos value par zero hai ya one bas get yahi kaam karta hai
// iske liye rulle simple hai
// 1. bit sift karo jitne position tak bola hai 
// 2. uske baad & operation perform karo yadi zero aaya to print the value zero 
// 3. else one
package Bit_Manipulation;
import java.util.*;
public class getBit_byUser {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        String Binary = Integer.toBinaryString(n);
        System.out.println("The given number is converted to binary: " +Binary);
        System.out.println("Enter the position which want to check bit value:");
        int pos = sc.nextInt();
        int bitmask = 1<<pos;
        sc.close();
        if((bitmask & n) == 0){
            System.out.println("The given position bit value is zero");
        }
        else{
            System.out.println("The given postion bit value is one");
        }
    }
}

// Output: enter the number: 
// 5            Binary me: 0101                         
           //   Position:  3210
// Enter the position which want to check bit value:
// 3
// The given postion bit value is zero which is also show in "binary me"