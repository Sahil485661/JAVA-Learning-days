package Sorting.Practice;
public class Selectionsort {
    public static void SelectionSort(int arr[]){
        for(int i = 0; i< arr.length-1;i++){
        int minPos =  i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[minPos]> arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];     //isme selection sort me swape ki itration kam ho jaati hai
            arr[minPos] = arr[i];       //as compare to bubble sort bas baaki T.C. is O(n^2) hi hogi
            arr[i] = temp;
        }
    }
    public static void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +" , ");
        }
    }
    public static void main(String args[]){
        int arr[] = {2,11,3,5,1,4};
       SelectionSort(arr);
       print(arr);
    }
}
