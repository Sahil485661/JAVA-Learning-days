package ForLooPattern;
public class butterfy_print {
    static void main(String[ ] args){
        int n =4;

        //upper full case
        /*      *
         **    **
         ***  ***
         ********/
        for(int i = 1 ; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j =  1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            for( int j = 1; j<=i;  j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower full case
        /********
         ***  ***
         **    **
         *      */
        for(int i = 1; i<= n; i++ ){
            for (int j = 1; j<=n-i+1; j++){
                System.out.print("*");
            }
            for(int j = 1; j<= 2*i-2;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}
/*
  Output:*      *
         **    **
         ***  ***
         ********
         ********
         ***  ***
         **    **
         *      *
 */