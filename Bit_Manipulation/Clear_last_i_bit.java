// Here we clear only lsb side last i bits means (if we have this 10101 binary i=2 means here only these two bits change 01)
package Bit_Manipulation;

public class Clear_last_i_bit {
    public static void main(String args []){
        int number = 13;
        int i = 2;
        int bitmask = (-1 << i);
        System.out.println("Before Clear:" +Integer.toBinaryString(number));
        System.out.println("After Clear:" +Integer.toBinaryString(number & bitmask));
    }
}
