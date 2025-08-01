package REcursion;

public class factorialRecursion {
    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int recursion = factorial(n-1);
        return n * recursion;
    }
    public static void main(String args []){
        int n = 5;
        int result = factorial(n);
        System.out.println(result);
    }
}
