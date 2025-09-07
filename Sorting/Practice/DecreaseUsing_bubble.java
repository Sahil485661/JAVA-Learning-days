package Sorting.Practice;

import java.util.Arrays;

public class DecreaseUsing_bubble {
    public static void bubble(int arr[]){
        for(int i = 0; i< arr.length-1;i++){
            for(int j = 0 ; j<arr.length-i-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {3,2,5,1,6,8,0};
        bubble(arr);
        System.out.print(Arrays.toString(arr));
    }
}
