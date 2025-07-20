import java.util.Scanner;

public class Primenumfind {
    public static void main(String arrgs[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int check = 0;
        sc.close();
        for(int i = 2; i<num;i++){
            for(int j = 2; j<Math.sqrt(i);j++){     //j<i bhi kar sakte hai but ye efficeint way hai
                if(i%j==0){
                    count++;
                }
            }
            if(count ==0){
                System.out.println(i);
                check ++;
            }
            else{
                count =0;
            }
        }
        System.out.println("Total Prime number is:"+check);
    }
}
