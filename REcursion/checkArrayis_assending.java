//Check given array is sorted in ascending order or not.
package REcursion;

public class checkArrayis_assending {
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return isSorted(arr, idx + 1);
        }
        else{
            return false;
        }
    }

    public static void main_(String args[]){
        int arr[] = {1,5,3,1,5,4,6};
        System.out.println("Array is sorted: " + isSorted(arr, 0));

    }
}
