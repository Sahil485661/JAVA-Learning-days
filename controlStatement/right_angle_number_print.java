package controlStatement;

public class right_angle_number_print {
    static void main(String[] args){
        int n = 5;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

/*Output:
         1
         12
         123
         1234
         12345
 */
