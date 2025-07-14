package ForLooPattern;

public class Diamond_star {
    static void main(String[] args){
        int n = 4;
        //Upper half
        for(int i = 1 ;  i<= n; i++){
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        //Lower half
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= i-1;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*n - (2*i-1);j++){
                System.out.print("*");
            }
            for(int j = 1; j<= 2*i - 2; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*
 * Output:  
   *   
  ***
 *****
*******
*******
 *****
  ***
   *
 */