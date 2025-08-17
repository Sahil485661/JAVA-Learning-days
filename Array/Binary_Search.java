// In binary Search we always check from mid index
// prerequisite is your given array should be sorted
package Array;
public class Binary_Search {
    public static void main(String args[]){
        int arr[] = {1,4,6,7,12,15,20,34};
        int target = 3;
        int start = 0;
        int end = arr.length-1;
        boolean found = false;
        while(start<=end){
            int mid = (start + end )/ 2;
            if(target == arr[mid]){
                System.out.println("SO your Element is stored in " +mid +" index.");
                found = true;
                break;
            }
            if(mid< target)     //right index
            {
                start = mid + 1;
            }
            else{               //left index
                end = mid -1;
            }
        }
        if(found == false)
        System.out.println("target was not found");
}
}
// Time Complexity = O(log2(n))