package Twod_Array;

public class Spiral_array {
    public static void Spiral(int arr[][]){
        int startrow = 0;
        int endrow = arr.length-1;
        int startcol = 0;
        int endcol = arr[0].length-1;       //for column we write arr[0]
        while(startrow <= endrow && startcol <= endcol){
            // Top
            for(int i = startcol ; i<endcol; i++){
                System.out.print(arr[startrow][i] +" ");
            }
            // Right 
            for(int i = startrow; i<endrow; i++){
                System.out.print(arr[i][endcol] +" ");
            }
            // Bottom
            for(int i = endcol; i>= startcol;i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(arr[endrow][i] +" ");
            }
            // left
            if(startcol < endcol){          //here this if is handle the situation when
                // you have arr[n number row][0] that means only one column
            for(int i = endrow-1; i>=startrow+1; i--){
        
                System.out.print(arr[i][startcol] +" ");
            }
        }
            startrow++;
            endcol--;
            startcol++;
            endrow--;
        }
    }
    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},
                        {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        Spiral(arr);
    }
}
