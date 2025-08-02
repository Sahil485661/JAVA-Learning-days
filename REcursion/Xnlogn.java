// here we print x^n (Stack height = logn)
package REcursion;

public class Xnlogn {
    public static int calculatePower(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        if(n%2==0){
            return calculatePower(x, n/2) * calculatePower(x, n/2);
        }
        else{
            return calculatePower(x, n/2) * calculatePower(x, n/2) *x;
        }
    }
    public static void main(String args[]){
        int x = 10;
        int n = 8;
        int ans = calculatePower(x,n);
        System.out.println(ans);
    }
}
