package ForLooPattern;

public class zero_one_pattern__print_ {
    static void  main(String[] args){
    int n = 5;
        for(int i = 1; i<= n; i++){
        for( int j = 1; j<= i; j++){
            int sum =  i + j;
            if (sum%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
}
}
/*Output: 
        1
        01
        101
        0101
        10101
 */
