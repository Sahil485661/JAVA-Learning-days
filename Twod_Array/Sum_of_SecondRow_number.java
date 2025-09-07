// Sum the second row of the matrix
package Twod_Array;

public class Sum_of_SecondRow_number {
    public static int secondrowSum(int arr[][]){
        if(arr.length<2){
            return 0;
        }
        int n = arr[0].length;
        int sum = 0;
        for(int i = 0; i < n;i++){
            sum += arr[1][i];
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[][] ={{2,4,5,6,7},{1,4,6,7,8},{2,1,3,4,5}};
        System.out.println("total sum: " +secondrowSum(arr));
    }
}
