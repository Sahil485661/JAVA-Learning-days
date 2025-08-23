package Array;

public class subarray_Sum {
    static int count = 0;
    public static void sum(int arr[])
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j< arr.length; j++){
                sum  = 0;
                for(int k = i ; k < j; k++){
                    System.out.print(arr[k] +",");
                    System.out.print(" ");
                    sum += arr[k];
                }
                count++;
                System.out.println("Sum of the subarray: " +sum);
            }
            System.out.println();
        }
        System.out.println("Total subarray :" +count);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        sum(arr);
    }
}
// Here we are sum the our subarray after completing the every line we get the sum of subarray
