package Array.Practice;

public class trape_water_prac {
    public static int trape(int height[]){
        // first we calculate Auxiliary array of left maximum boundary
        int leftmax[] = new int [height.length];
        leftmax[0] = height[0];
        for(int i = 1; i< height.length; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        // now we find the right max boundary by creating Auxiliary array  and store all element here
        int rightmax[] = new int [height.length];
        rightmax[height.length - 1] = height[height.length -1];
        for(int i = height.length - 2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        int trape_water = 0;
        for(int i = 0; i< height.length; i++){
            // here we first find minimum water level bar
            int water_level = Math.min(leftmax[i], rightmax[i]);
            // here we calculate the final trape water how much water is traped here
            // trape_water += water level - height[i];
            trape_water += water_level - height[i];
        }
        return trape_water;
    }
    public static void main(String args[]){
        int height[] = {0,0,0,1,2,32,11,232,311};
        System.out.println("Total trapped water is : " +trape(height));
    }
}
