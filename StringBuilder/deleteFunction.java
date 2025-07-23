package StringBuilder;

public class deleteFunction {
    public static void main(String args []){
        StringBuilder word =new StringBuilder("India is the 5th largest eeconomy in the world");
        word.delete(0,6);
        System.out.print(word);
    }
}
