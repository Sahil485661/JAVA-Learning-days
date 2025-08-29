// Given  an integer array nums, return true if any value appears at least twice in the array , 
// and return false if array element is distict
package Array.Practice;

public class Twiceappeared {
    public static boolean twice(int nums[]){
        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]== nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int nums[] = {2,1,3,7,4,5,6,8,4};
        System.out.println("Given integer array has appear at least twice than print true, otherwise return false:" +twice(nums));
    }
}
