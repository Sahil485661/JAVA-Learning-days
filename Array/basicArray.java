package Array;

public class basicArray {
    public static void main(String[] args){
        int[] Marks = new int[3];
        Marks[0]= 93;
        Marks[1]= 90;
        Marks[2]= 99;
        System.out.println("Physics Marks: " +Marks[0]);
        //Another way to print array using loop
        for(int i = 0; i<3; i++){
            System.out.println(Marks[i]);
        }

    }
}
