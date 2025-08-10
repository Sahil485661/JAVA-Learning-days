package REcursion;

public class FindOccurence{
    public static int first = -1;
    public static int last = -1;
    public static void find(String str, int index, char element){
        if(index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char crrchar = str.charAt(index);       //It's extracting a single character from the string str at the position specified by index. and then assign it to crrchar. 
        if(crrchar ==  element){
            if(first == -1){
                first = index;

            }
            else{
                last = index;
            }
        }
        find(str, index +1, element);
    }
    public static void main(String args[]){
        String str = "aaddfjdksfdjkakkkdjaeiasdfasmkfmkla";
        char element = 'a';
        int index = 0;
        find(str, index, element);
    }
}