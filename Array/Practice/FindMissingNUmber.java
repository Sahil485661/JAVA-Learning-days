// Given an array of n-1 distinct number in the range of 1 to n
// Find the missing number in it.
// arr[] num = {2,4,1,8,6,3,7}
package Array.Practice;

public class FindMissingNUmber {
    public static int missing(int num[]){
        int num_add = 0;
        int sum = ((num.length+1)*((num.length+1)+1))/2;     // Ye formula main hai ratt le here we use this formula "n*(n+1)/2"
        for(int i = 0; i< num.length; i++){
            num_add = num[i]+ num_add;
        }
        return sum - num_add;
    }
    public static void main(String args[]){
        int num[] = {1,2,3,5,6};
        System.out.println(missing(num));

    }
}
