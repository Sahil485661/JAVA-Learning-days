// Swap two number without using third variable.
package Bit_Manipulation.Practice;

public class SwapTwoNum {
    public static void swap(int a , int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Swap Using Substraction and Addition");
        System.out.println("a:" +a);
        System.out.println("b:" +b);
    }
     public static void swapUsingXOR(int a , int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Swap Using XOR Method");
        System.out.println("a:" +a);
        System.out.println("b:" +b);
    }
    public static void main(String[] args) {
        int a = 10; 
        int b = 5;
        swap(a, b);
        swapUsingXOR(a, b);
    }
}
