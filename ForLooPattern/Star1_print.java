package ForLooPattern;

public class Star1_print {
    static void main(String[] args){
        int n = 5;
        for(int i = 0; i<5; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j< n*2-(2*i+1); j++){
                System.out.print("*");
            }
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*Output:*********
          *******
           *****
            ***
             *
 */