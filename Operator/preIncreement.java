package Operator;

public class preIncreement {
    public static void main(String args []){
        int a = 10;
        int b = 0;
        b = ++a;
        //a = 10 se a ki value 10 ho gayi.
        //b = ++a ka matlab:
        // Pehle a ki value 1 se badh jaati hai (a = 11)
        // Phir b me nayi value assign ho jaati hai (b = 11)
        System.out.println("a ="+a);
        System.out.println("b =" +b);
    }
}
