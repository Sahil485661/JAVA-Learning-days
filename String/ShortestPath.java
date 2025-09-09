// Here we are finding sortest(Displacement path) path from the  (0,0) 
// So we are firstly calculate the path direction by Using W,S,E,N 
// After that we use formula √(x2-x1)^2 + (y2-y1)^2 
package String;

public class ShortestPath {
    public static double Displacement(String route){
        // double startx =0, starty =0;   //These are the centre point of the axis
        double x = 0, y = 0; // Here is this is starting to find route so this is declare
            
        for(int i =0; i<route.length();i++){
            int dire = route.charAt(i);     //It is always track the character value in string
            // NOw we check first for west
            if(dire == 'W'){
                x--;
            }
            else if(dire == 'E'){
                x++;
            }
            else if(dire == 'N'){
                y++;
            }
            else{
                y--;
            }
        }
        double x2 = x *x;//Here we calculate the  (x2-x1) ka square but we know that startx is 0
        double y2 = y *y;//Here we calculate the  (y2-y1) ka square but we know that starty is 0
        return(Math.sqrt(x2+y2));
    }
    public static void main(String args[]){
        String route = "WNEENWNSWNSENWSNEWNSNEWNSNNEWSNENENWNWNWNENNNSNWN";
        System.out.println(Displacement(route));
    } 
}
