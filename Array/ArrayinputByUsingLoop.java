package Array;

import java.util.Scanner;

public class ArrayinputByUsingLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int Marks[] = new int[size];
        //input loop 
        for(int i = 0; i< size;i++ ){
            Marks[i] = sc.nextInt();
        }
        sc.close();
        //output loop
        for(int i= 0; i<Marks.length;i++){
            System.out.println("Marks all: " +Marks[i]);
        }
    }
}
