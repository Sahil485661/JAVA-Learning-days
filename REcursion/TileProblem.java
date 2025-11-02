// This Question is comes in the AMAZON.
// Here we have a 2xn floor (length X Bredth) and tile size is 2x1 So How much ways is comes to put tile 
// on the floor vertically and horizontally 
package REcursion;
public class TileProblem {
    public static int ways(int n){
        if(n == 0|| n==1){
            return 1;
        }
        // vertical    fnm1 means f(n minus 1)
        int fnm1 = ways(n-1);
        // horizontal  fnm2 means f(n minus 2)
        int fnm2 = ways(n-2);
        int totalways = fnm1 +fnm2; // here we calculate total ways
        return totalways;
    }
    public static void main(String[] args) {
        int n = 40;
        System.out.println(ways(n));
    }
}
