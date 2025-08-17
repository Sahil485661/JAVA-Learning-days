// Reverse the given array 
package Array;

public class revvverse {
    public static void main(String args []){
        int arr[] ={63,35,2,23,55,11};  // index are 0 to 5
        // int num = arr.length;
        int start = 0;
        int end = arr.length-1;         // element are 1 to 6
        // for(int i = num-1; i >= 0;i--){
        //     System.out.println(arr[i]);
        // }
        while(start < end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] +",");
        }
    }
}
// Timecomplexity : O(n)
// Space Complexity : O(1)