// This program demonstrates how to update (set or clear) a bit at a given position in an integer.
// If the bit at 'pos' is 0, it sets it to 1. If the bit is 1, it clears it to 0.
// It prints the binary representation before and after the update.
// update bit is the combinaton of set(1) and clear(0) bit 
package Bit_Manipulation;

public class UpdateBit {
    public static void main(String args []){
    int n = 5;      // The number whose bit will be updated
    int pos = 3;    // The position of the bit to update (0-based from right)
    int bitMask = 1<<pos;   // Creates a mask with 1 at 'pos'
    int notbitmask = ~(bitMask);  // Inverse mask for clearing the bit
    String Binary0 = Integer.toBinaryString(n);
    System.out.println("Given Integer number convert to binary " +Binary0);
    if((bitMask & n) == 0){
         // If bit is 0, set it to 1 using OR operation
          int set = bitMask | n;
          String Binary1 = Integer.toBinaryString(set);
          System.out.println("After the set because the given position is have 0 value so we update it by 1 'Final value is this' " +Binary1);
         }
    else{
        // If bit is 1, clear it to 0 using AND with inverse mask
        int clear = notbitmask & n;
        String Binary2 = Integer.toBinaryString(clear);
        System.out.println("After the update the final value is " +Binary2);
    }
}
}