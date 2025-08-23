// Iski Time Complexity O(n^3) hai.
// NExt Max subarray sum prefix sum me time complexity o(n^2) hogi.
// isse bhi kam time complexity kadane's Algorithm me ho ti hai  
package Array;
public class MAX_Subarray_Sum{
    public static void funn(int arr[]){
        int Max = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length;i++){
            for(int j = i ; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k<=j; k++){
                    sum += arr[k];
                }
                if(Max < sum){
                    Max = sum;
                    }
                    if(Max < sum){
                        Max = sum;
                }
            }
        }
        System.out.println("Final Max Subarray is :" +Max);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,32};
        funn(arr);
    }
}