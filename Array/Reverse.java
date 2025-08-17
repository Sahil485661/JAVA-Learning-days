// Reverse the given Arrray
package Array;
public class Reverse {
    public static void main(String args[]){
        int arr[] = {43,2,4,1,54,89,77};
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        for(int i = 0;i < arr.length; i++){
        System.out.println(arr[i]);
    }
}
}
// Timecomplexity : O(n)
// Space Complexity : O(1)
