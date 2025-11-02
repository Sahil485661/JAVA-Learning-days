package REcursion;


public class DeleteDuplicate {
    public static void duplicateRemove(int idx, String str, StringBuilder newstr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        // kaam
        char currchar = str.charAt(idx);
        if(map[currchar -'a'] == true){
            duplicateRemove(idx+1, str, newstr, map);
        }
        else{
            map[currchar -'a'] = true;
            duplicateRemove(idx+1, str, newstr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        duplicateRemove(0, str, new StringBuilder(""), new boolean[26]);

    }
}
