// Q. WAP to add 1 in the given integer usign NOT Operator?
package Bit_Manipulation.Practice;
public class addOneInInteger {
    public static int add_one(int a){
        // a ko reverse karne par -(a+1) milta hai means Negative me bas hum usse
        //  positive bana dete hai "-" use karke 
        return -(~a);

    }
    public static void main(String[] args) {
        int a = 12;
        System.out.println(add_one(a));
    }
}