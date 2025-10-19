// here we write code for check the given array is sorted or not?
package REcursion;

public class Array_is_sorted {
    public static boolean issorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,6,7,86,76};
        System.out.println(issorted(arr, 0));
    }
}
