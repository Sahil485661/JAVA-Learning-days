//compare is compare to values starting character. 
//The character is if A Than their value is lowest Because A<B<C<D<E....<Z. and So On.
// compareTo() ka kaam kya hai?
// Ye method do values ko compare karta hai aur ek integer return karta hai:
// 0 → dono values equal hain
// < 0 → current object chhota hai
// > 0 → current object bada hai

// equals() method kya karta hai:
// Ye method object comparison ke liye use hota hai.
// Ye check karta hai ki do objects ka content same hai ya nahi.
// Mostly String, Integer, List, etc. ke comparison mein use hota hai.

package String;

public class CompareTo {
    public static void main(String args []){
        String FirstName = "Sahil";
        String LastName = "Sahil";
        if(FirstName.compareTo(LastName)==0){
            // if(FirstName.equals(LastName)){
            System.out.println("They are similar");
        }
        else{
            System.out.println("These are not similar");
        }
    }
}
