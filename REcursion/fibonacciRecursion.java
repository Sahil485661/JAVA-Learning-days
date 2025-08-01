package REcursion;

public class fibonacciRecursion {
    public static void fibonacci(int a, int b, int n){
        if (n == 0){
            return;
        }
        int c = a +b;                   //here our code is adding two numbers
        System.out.println(c);          //here printing the added number
        fibonacci(b, c, n-1);           //here we are doing a = b and b = c that means b ki jo value hai a ko asign ho jayegi  and c ki value b ko asign ho jayegi
    }
    public static void main(){
        int a = 0;
        int b = 1;
        int n = 10000;
        System.out.println(a);
        System.out.println(b);
        fibonacci(a,b,n-2);
    }
}
