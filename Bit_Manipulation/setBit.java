package Bit_Manipulation;

public class setBit {
    public static void main(String args[]){
        int a =5;
        int pos = 1;
        int BitMask = 1<<pos;
        int Result = a | BitMask;
        String Binary = Integer.toBinaryString(Result);     //This is convert the variable integer to binary
        String Binary1 = Integer.toBinaryString(a);
        System.out.println("Given Number is "+Binary1);
        System.out.println("So the after change in bit the final output is "+Binary);
    }
}
