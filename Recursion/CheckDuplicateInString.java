package Recursion;

public class CheckDuplicateInString {
    // static String checkDuplicateCharInString(String str, int indx){
    //     if(str.length() == 0 || indx+1 == str.length()){
    //         return str;
    //     }
    //     char var = str.charAt(indx);
    //     int strt = indx +1;
    //     while (strt < str.length()) {
    //         if(str.charAt(strt) == var){
    //             str = str.substring(0, strt) + str.substring(strt+1, str.length());
    //         }
    //         strt++;
    //     }
    //     return checkDuplicateCharInString(str, indx+1);
    // }

    static void checkDuplicateCharInString(String str, int indx, StringBuilder newStr, boolean map[] ){
        if(indx == str.length()){
            System.out.println(newStr);
            return ;
        }
        char curChar = str.charAt(indx);
        if(map[curChar - 'a']){
            checkDuplicateCharInString(str, indx+1, newStr, map);
        }else{
            map[curChar - 'a'] = true;
            checkDuplicateCharInString(str, indx+1, newStr.append(curChar), map);
        }

    }
    public static void main(String[] args) {
        boolean[] map = new boolean[26];
        checkDuplicateCharInString("appnnacollege", 0,new  StringBuilder(""),new boolean[26]);
    }
}
