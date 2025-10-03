// ith bit ko 1 kar do by using set operation
package Bit_Manipulation.Practice;

public class setbitpractice {
    public static void main(String args[]){
        int a = 5;
        int bitmask = 1<<1;
        System.out.println(Integer.toBinaryString(a|bitmask));
    }
}
