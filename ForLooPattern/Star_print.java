package ForLooPattern;

public class Star_print {
   static void main(String[] args)
   {
     int n = 5;
     for(int i = 0; i<=n-1; i++){
          //space print this loop
          for(int j = 0; j<= n-i-1;j++){
               System.out.print(" ");
          }
          for(int j = 0; j< 2*i+1; j++){
               System.out.print("*");
          }
          for(int j = 0; j<= n-i-1; j++){
               System.out.print(" ");
          }
          System.out.println();
     }
   } 
}
/*    *     
     ***
    *****
   *******
  *********
 */
