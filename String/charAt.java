package String;

public class charAt {
    public static void chara(String name){
        for(int i =0; i<name.length();i++){
            System.out.print(name.charAt(i));
        }
    }
    public static void main(String args[]){
        String name = "Sahil Vishwakarma";
        chara(name);
    }
}
