// It is powerful method that are reduce the step for calculation
// the time complexity is reduced O(n) to O(log n)
// here we are doing to calculate the power of the given value like a^n in simple term

package Bit_Manipulation;

public class Fast_Exponentition {
    public static long Fast_Expo(long a, long n){
        long ans = 1;
        while(n > 0){
            if((n&1)!=0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        long a = 5;
        long n = 13;
        System.out.println("a^n is: " +Fast_Expo(a, n));
    }
}
