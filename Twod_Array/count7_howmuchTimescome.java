// In this code we need to find the how much times 7 has comes in the matrix
// Time Complexity: O(n^2)
package Twod_Array;
public class count7_howmuchTimescome {
    public static int times(int arr[][]){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i< n; i++){
            for(int j = 0; j< arr[0].length; j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[][] = {{4,7,8}, {8,8,7}};
        System.out.print("The 7 is comes: " +times(arr));
    }
}
