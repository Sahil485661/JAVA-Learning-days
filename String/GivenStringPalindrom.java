// Here we search our string is pallindrom or not 
// Palindrom means given string have word similar from front and back
// for example Noon , Racecar are pallindrom 
package String;

public class GivenStringPalindrom {
    public static boolean pallindrom(String word){
        int n = word.length();
        for(int i = 0; i< n/2; i++){
            if(word.charAt(i) != word.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String word = "noon";
        System.out.print( "The given word is "+pallindrom(word)+" for Pallindrom.");
    }
}
