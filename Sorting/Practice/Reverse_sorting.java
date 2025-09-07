// Here we reverse sort the array via java inbuilt function
// but here main thing is we cannot use premitive variable we need to use object variable
// So we are make the  "Integer" variable against to "int"
package Sorting.Practice;
import java.util.Arrays;
import java.util.Collections;
public class Reverse_sorting {
    public static void main(String args []){
        Integer arr[] = {2,4,1,3,5,6,8,1,0,9};
        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, 4,9, Collections.reverseOrder());
        System.out.print(Arrays.toString(arr));
    }
}
