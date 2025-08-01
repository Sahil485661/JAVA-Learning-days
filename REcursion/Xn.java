// here we print x^n (Stack height = n)
package REcursion;

public class Xn {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;        
        }
        int cal_pow = power(x, n-1);            
//power(10, 3)
// → 10 * power(10, 2)
//          ↓
//       10 * power(10, 1)
//                ↓
//             10 * power(10, 0)
//                      ↓
//                    return 1
// Now stack unwind hota hai:

// power(10, 0) = 1

// power(10, 1) = 10 * 1 = 10

// power(10, 2) = 10 * 10 = 100

// power(10, 3) = 10 * 100 = 1000
        int x_pow = x * cal_pow;
        return x_pow;
    }
        
public static void main(String args []){
    int x = 10;
    int n = 5;
    int ans = power(x,n);
    System.out.println(ans);
}
}
