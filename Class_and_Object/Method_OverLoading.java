// In the polymorphism we have the Method overloading
package Class_and_Object;

public class Method_OverLoading {
    public static void main(String[] args) {
      Calculator calc = new Calculator();
      System.out.println(calc.sum(1,2));
      System.out.println(calc.sum((float)1.5, (float)2.5));
    System.out.println(calc.sum(1,5, 7));
    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum (float a, float b){
        return a+b;
    }
    int sum( int a , int b, int c){
        return a+b+c;
    }
}