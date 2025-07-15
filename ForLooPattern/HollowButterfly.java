package ForLooPattern;

public class HollowButterfly {
    static void main(String[] args){
        int n = 5;
        /*upper half */
        for(int i = 1; i <= n;i++){
            //left side wing upper side
            for(int j = 1; j <= i; j++){
                if(j==1||i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            //Space in center
            for(int j = 1; j<=2*n-(i*2);j++){
                System.out.print(" ");
            }

            //Right side wing of upper side
            for(int j = 1; j<= i; j++){
                
                if(j == i||j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //lower half
        for(int i = 1; i <= n;i++){
            //left wala wing
            for(int j = 1; j<= n-i+1; j++){
                if( j == 1||j == n-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //lower case Space print
            for(int j = 2*i-2; j>= 1; j--){
                System.out.print(" ");
            }
            //Right part of lower case
            for(int j=1;j<=n-i+1;j++){
                if(j==n-i+1||j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
    }
}
/*
 Output:
*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *
 
*/