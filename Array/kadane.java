// Iss kadane algorithm se bhi Subarray maximum calculate kar sakte hai 
// iss algorithm ki time complexity O(n) hai 
// Time complexity ke base par
// Max_Subarray_sum > Max _Subarray_Sum(Prefix)> Kadane Algorithm
package Array;

public class kadane {
    public static void kadanes(int arr[]){
        int max = Integer.MIN_VALUE;
        int curr_sum  = 0;
        for(int i = 0 ; i< arr.length; i++){
            curr_sum = curr_sum + arr[i];
            if(curr_sum<0){
                curr_sum = 0;
            }
            // if(max< curr_sum){
            //     max = curr_sum;
            // }
            max =  Math.max(curr_sum, max);
        }
        System.out.println("Max subarray summ is : " +max);
    }
    public static void main(String args[]){
        int arr[] = {-1,-3,-5,3,-5,-22,-8,-2,4,3};
        kadanes(arr);
    }
}
