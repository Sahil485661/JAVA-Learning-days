//compare is compare to values starting character. 
//The character is if A Than their value is lowest Because A<B<C<D<E....<Z. and So On.
package String;

public class CompareTo {
    public static void main(String args []){
        String FirstName = "Sahil";
        String LastName = "Vishw";
        if(FirstName.compareTo(LastName)==0){
            System.out.println("They are similar");
        }
        else{
            System.out.println("These are not similar");
        }
    }
}
