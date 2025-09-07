// Here we write the code for the transpose the array here we change the matrix like 
// if our matrix has 2❌5 than we transform them into the 5❌2 and also change the our array.
package Twod_Array;
import java.util.Arrays;

public class TransposeMatrix {
    public static void matrix(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int temp[][] = new int[m][n];
        for(int i = 0; i< n; i++){
            for(int j= 0; j< m; j++){
                temp[j][i] = arr[i][j];
            }
        }
        for(int i = 0; i< temp.length; i++){
            System.out.println(Arrays.toString(temp[i]));
        }
    }
    
    public static void main(String args[]){
        int arr[][] ={{3,4,2,5},{3,1,5,7}};
        matrix(arr);
    }
}
