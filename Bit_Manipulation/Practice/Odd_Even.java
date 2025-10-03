// Check the given number is odd or even
package Bit_Manipulation.Practice;

public class Odd_Even {
    public static void number(int a){
        if((a & 1)==1){
            System.out.println("The given number is odd");
        }
        else{
            System.out.println("The given number is even");
        }
        }
        public static void main(String args[]){
            int a = 2;
            number(a);
            number(24);
            number(13);
            number(15);
            number(200);
        }
}
