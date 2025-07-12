package ForLooPattern;

public class number_print {
    static void main(System[] args){
        int n = 5;
        for(int i = 0; i<n; i++){
            for(int j = 0; j < n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*Output: 
        12345
        1234
        123
        12
        1
 */