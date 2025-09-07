package Sorting.Practice;

import java.util.Arrays;

public class DecreasingUsing_Selection {
    public static void Selection(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            int minPos = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[minPos]< arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] =temp;
        }
    }
    public static void main(String args[]){
        int arr[] = {4,2,5,1,6,7,9,1};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
