// Here we check the given number is the power of 2 or not ;
// For example 4,8,16,32 2^2, 2^3, 2^4 etc are the power of 2
package Bit_Manipulation;

public class Power_of_two {
    public static boolean check(int number){
        // if((number & number-1) == 0){
        //     return true;
        // }
        return ((number & number-1) == 0);
    }
    public static void main(String[] args) {
        int number = 2;
        System.out.println(check(number));
    }
}
