package ForLooPattern;

public class floyd_triangle_numberprint {
    public static void main(String[] args){
        int n = 5;
        int number = 1;  //increase and printing this number
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(number +" ");
                number++;
            }
            System.out.println();
        }
    }
}
/*
  Output: 
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
 */
