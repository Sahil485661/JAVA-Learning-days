package REcursion;


public class DeleteDuplicate {
    public static void duplicateRemove(int idx, String str, StringBuilder newstr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        // kaam
        char currchar = str.charAt(idx);
        // map[] sirf ye integer value ko check karta hai. yadi integer value map[] array me true hai . to next index me switch kar dega
        // for example map[0] aaya toh yeh ab new string variable me append ho jayega and index bhi ++ ho jayega
        // ab map['p' - 'a'] (p-a = 15 ) hoga. ab ye bhi new string me nahi hai. toh isko bhi true maan lega and newstr me append hoga
        // ab dubara map['p' -'a'] hoga. isme ab map[15] true hai. pichle p me hamne map[15] ko true kar diya tha.
        // So iss baar bus idx bass ++ hoga and newstring me no change rahega
        if(map[currchar -'a'] == true){         //kisi bhi character ko character value se minus karaoge toh wo ascii value me convert hoke minus honge
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
