// In this we are print the array like if we hve 2,4,6,8,10 then isko kuch iss type se print karega
// Output:
    // (2,4),(2,4,6),(2,4,6,8),(2,4,6,8,10)
    // (4,6),(4,6,8),(4,6,8,10)
    // (6,8),(6,10)
    // (8,10)
package Array;

public class subarrayprint {
    public static void main(String args[]){
        int arr[] = {2,5,3,23,4,43,55,65};
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]);
                    if(k<j) System.out.print(",");
                }
                System.out.println();
            }
        }
    }
}
// Output:
// 2,5
// 2,5,3
// 2,5,3,23
// 2,5,3,23,4
// 2,5,3,23,4,43
// 2,5,3,23,4,43,55
// 2,5,3,23,4,43,55,65
// 5,3
// 5,3,23
// 5,3,23,4
// 5,3,23,4,43
// 5,3,23,4,43,55
// 5,3,23,4,43,55,65
// 3,23
// 3,23,4
// 3,23,4,43
// 3,23,4,43,55
// 3,23,4,43,55,65
// 23,4
// 23,4,43
// 23,4,43,55
// 23,4,43,55,65
// 4,43
// 4,43,55
// 4,43,55,65
// 43,55
// 43,55,65
// 55,65
