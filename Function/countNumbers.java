//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
package Function;
import java.util.*;
public class countNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        do{
        System.out.print("Enter the number: ");    //yaha se hum input lene ke program ready karte hai
        a = sc.nextInt();
        if( a>0){
            positive+=1;
        }
        else if(a<0){
            negative+=1;
        }
        else{
            zero+=1;
        }
        System.out.println("If you want more input please give input y or not give more input then press 'n': ");       //yaha se hum user se clear karte hai ki aur input dena hai ki nahi
        char ch = sc.next().charAt(0);
        if(ch=='n' ||ch =='N'){
            break;
        }
        }
        while(true);
        sc.close();     //Yaha se scanner close ho jata hai ab aage input nahi lega

        //yaha ab hum sabh value ko print kar dete hai.
        System.out.println("Aapke dwara total " +positive +" positive number diya gaya hai. ");
        System.out.println("Aapke dwara total " +zero +" Zero diye gaye hai.");
        System.out.println("Aapke dwara total " +negative +" Negative number diye gaye hai.");
}
}
