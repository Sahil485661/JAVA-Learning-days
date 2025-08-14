package Array;
public class largest_number{
    public static void main(String args[]){
        int arr[] = {23,54,7,12,45,65,90,1};
        int largest = arr[0];
        for(int i = 1; i<arr.length-1; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
}
}