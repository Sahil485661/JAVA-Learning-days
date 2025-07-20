package Twod_Array;
import java.util.*;
public class TakeInputandPrint {
    public static void main(String args[]){
        int num[][] = new int [3][2];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 3;i++){
            for(int j = 0;j<2;j++){
                num[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(int i = 0; i<3; i++){
            for(int j = 0; j<2; j++){
                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }
    }
}
