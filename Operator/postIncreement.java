package Operator;

public class postIncreement {
    public static void main(String args[]){
        int a = 20 ;
        int b = 0;
        b = a++;        //a = 20 se a ki value 20 ho gayi.
                        //b = a++ ka matlab:
                        //Pehle b me a ki current value assign ho jaati hai (b = 20)
                        //Phir a ki value 1 se badh jaati hai (a = 21)
        System.out.println("a=" +a);
        System.out.println("b= " +b);
    }
}
