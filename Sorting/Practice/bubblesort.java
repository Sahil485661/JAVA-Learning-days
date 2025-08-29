package Sorting.Practice;

public class bubblesort {
    public static void sort(int arr[]){
        for(int i = 0; i < arr.length -1; i++){
            for(int j = 0; j < arr.length -1- i; j++){
                if(arr[j] > arr[ j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            }
        }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args []){
        int arr[] = {3,5,1,6,2,4};
        sort(arr);
        
    }
}
