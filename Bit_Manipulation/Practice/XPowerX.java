// What is the value of x^x for any value x?
package Bit_Manipulation.Practice;

public class XPowerX {
    public static int Power(int a, int exponent){
        int ans = 1;
        while(exponent>0){
            if((exponent&1)!= 0){
                ans = ans * a;
            }
            a = a*a;
            exponent = exponent>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a = 4;
        System.out.println(Power(a,a));
    }
}
