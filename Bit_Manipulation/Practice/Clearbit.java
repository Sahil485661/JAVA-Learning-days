// Clear operation is use for change the ith bit value in zero whether the bit is 0 or 1.
package Bit_Manipulation.Practice;

public class Clearbit {
    public static void main(String args[]){
        int a = 100;
        int bitmask = ~(1<<2);
        System.out.println("Before Clear in binary:"+Integer.toBinaryString(a));
        System.out.println("After Clear in binary:"+Integer.toBinaryString(a & bitmask));
    }
}
