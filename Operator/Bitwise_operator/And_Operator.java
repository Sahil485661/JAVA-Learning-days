package Operator.Bitwise_operator;

public class And_Operator {
    public static void main(String args[]){
        int a =5;
        int b = 3;
        int r = a & b;
        int OrR = a | b;
        int XorR = a ^ b;
        int ComplementR = ~b;
        int LeftSift = a<<2;
        int RightShift = a>>2;
        System.out.println(r);
        System.out.println(OrR);
        System.out.println(XorR);
        System.out.println(ComplementR);
        System.out.println(LeftSift);
        System.out.println(RightShift);
    }
}
