//Q. Count Set Bits(1) in given number 
package Bit_Manipulation;

public class CountSet_Bits {
    public static int CountSetBit(int number){
        int bitmask = 1;
        int count = 0;
        while(number > 0){
            if((number & bitmask) == 1){
                count++;
            }
            number = number >> 1;
        }
        return count;
    }
    public static int CountSetBit2(int number){
        int count =0;
        while (number>0) {
            number = number & number-1;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int number = 144;
        System.out.println("BEfore:" +number);
        System.out.println("Total Set(1) Bits in " +number +" are " +CountSetBit2(number));
    }
}
