package ForLooPattern;

public class V_pattern {
    static void main(String[] args){
        int n = 4;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= i; j++){
                if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j= 1; j<=n*2-(i*2+1);j++){
                System.out.print(" ");
            }
            
                if(i!=n){
                    System.out.print("*");
                }
                else if(i==n){

                }
                else{
                    System.out.print(" ");
                }
            
            System.out.println();
        }
    }
}
/*
 Output:
       *     *
        *   *
         * *
          *
 */