// Isme hum array ke sabhi negative element me se sumbarray sum nikalenge .
package Array;

public class kadane_Negative_ArrayElement {
    public static void negative(int arr[]){
        int Max = Integer.MIN_VALUE;
        int curr_sum = 0;
        for(int i = 0; i< arr.length; i++){
            curr_sum = curr_sum + arr[i];
            if(curr_sum < arr[i]){
                curr_sum = arr[i];
            }
            Max = Math.max(curr_sum, Max);
        }
        System.out.println("Print max Subarray sum: " +Max);
    }
    public static void main(String args[]){
        int arr[] = {-2,-1,-5,-8,-9,-13};
        negative(arr);
    }
}
