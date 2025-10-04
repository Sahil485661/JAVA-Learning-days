// In this quetion we need to calculate the how much water is traped between the bars
// this is possible to calculate water via auxiliary array
// Auxiliary array is the array that is helper array to make ease the problem and efficient way
package Array;

public class Trape_RainWater {
    public static void rain(int height[]){
        // First we create array that is store the left maximum Boundary.we creating auxiliary array for every index
        int left_MaxBound [] = new int [height.length];
        left_MaxBound[0] = height[0];
        for(int i = 1; i< height.length; i++){
            left_MaxBound[i] = Math.max(height[i], left_MaxBound[i-1]);
        }
        // Now we need to calculate right max boundary. we creating auxiliary array for every index.
        int Right_max[] = new int [height.length];
        Right_max[height.length -1] = height[height.length - 1];
        for(int i = height.length -2; i>= 0; i--){
            Right_max[i] =Math.max(height[i], Right_max[i+1]);
        }
        // loop
        int total_traped_water = 0;
        for(int i = 0; i<height.length;i++){
            // first we need to find water level
            int water_Level = Math.min(left_MaxBound[i], Right_max[i]);
            // Now we calculate the trapped water in the bars
            // using this formula : Trapped_water = water_level - height[i];
            int traped_water = water_Level - height[i];
            total_traped_water = traped_water + total_traped_water;
        }
        System.out.println("Total Trapped Water in the Bars Are: " +total_traped_water);
    }
    public static void main(String args[]){
        int height[] = {1,8,6,2,5,4,8,3,7};
        rain(height);
    }
}
