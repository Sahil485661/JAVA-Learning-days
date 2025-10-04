// In this clear range bit mean we are clear the bit in range 
// So in question given that n means number 'i' means starting range 'j' means end range for clear.
// Yaha 'i' jo hoga wo right side se start hota hai means counting bit right to left (0 to ...)
// Que. Here n = 130, i =2, j= 7 so clear the range bitween i to j
package Bit_Manipulation;

public class ClearRange_Bit {
    public static int clear(int n, int i, int j){
        int start_range = (1<<i)-1;     // Because hame isme i ke pahle waali sabhi bit 1 chaahiye baaki aur janne ke liye isko samajhna ke liye rough check karo detailed hai ...
        int end_range = ((~0)<<(j+1));  // Because hame 7 ke baad waali bit 1 chaahiye and uske pahle zero
        int bitmask =  end_range | start_range; //it is giving us zero at given range
        // Now we are created a bitmask that has in the given range 
        return n & bitmask;
    }
    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        int j = 7;
        System.out.println("Before Clear:" +Integer.toBinaryString(n));
        System.out.println("After in Decimal:" +clear(n, i, j));
        System.out.println("After Clear:" +Integer.toBinaryString(clear(n, i, j)));;
    }
}