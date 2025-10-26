package REcursion;

public class XpowerNlogn {
    public static int OptimizeddPower(int x, int n){
        if(n==0) return 1;
        int halfPower = OptimizeddPower(x, n/2);
        int Power = halfPower * halfPower;
        if(n%2 != 0){
            Power = x * Power;
        }
        return Power;
    }
    public static void main(String[] args) {
        int x = 12;
        int n = 4;
        System.out.println(OptimizeddPower(x,n));
    }
}
