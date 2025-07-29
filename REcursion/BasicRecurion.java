// Here i am doing reverse counting using the recursion.
package REcursion;

public class BasicRecurion {
    public static void reverse(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        reverse(n-1);
    }
    public static void main(String args []){
        int a = 5;
        reverse(a);

    }
}
