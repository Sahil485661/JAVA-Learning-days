// Find Max Subarray sum by using prefix sum 
// isme Time COmplexcity bruteforce method se kam ho hai O(n^2)
// yaha hum direct prefix[arrr.length] print kara sakte the but isse yadi arraay me nigative value huyii tab array ke max
// subarray me impact padega jisse hum max subarray nahi found kar paayenge. so hame har array check karna padega
package Array;

public class Max_SubarrayPREFIX_SUM{
    public static  void funn(int arr[]){
        int currSum  = 0;
        int max =  Integer.MIN_VALUE;
        int prefix[] = new int [arr.length];    //Auxiliary array
        prefix [0] = arr[0];    
        for(int i = 1; i< prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];           // yaha pe main hai prefix ka array me sum of subarray store hota hai
        }
        for(int i = 0; i< arr.length;i++){
            for(int j = i; j< arr.length ; j++){
                //yaha pe if else laga rahe hai ki i ==0 ho toh prefix of [j] print ho 
                // else {prefix [j] - prefix[i - 1]} hokar currsum me  value store kar dega.
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i -1];
                // iske baad  currsum yadi max se bada ho tab uski value store hogi max me
                if(max < currSum){
                    max = currSum;
                }
            }
        }
        System.out.print("Max Subarrray Sum : " +max);
    }
    public static void main(String args []){
        int arr[] = {2,4,6,8,10,12};
        funn(arr);
    }
}
