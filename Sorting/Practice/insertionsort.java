package Sorting.Practice;

public class insertionsort {
    public static void insertsort(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;     //ye sorted array ke liye important hai
            // find the correct position to insert the sorted element
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insert 
            arr[prev + 1] = curr;
        }
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] +",");
        }
    }
    public static void main(String args[]){
        int arr[] = {3,6,8,9,1,3,5,4};
        insertsort(arr);
    }
}
