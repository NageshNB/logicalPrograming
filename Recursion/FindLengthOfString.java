package Recursion;

public class FindLengthOfString {
    static void stringLength(String str, int count){
        if(str == ""){
            System.out.println(count);
            return;
        }
        stringLength(str.substring(0,str.length()-1), count+1);
    }

    public static void main(String[] args) {
        stringLength("null11", 0);
    }
}
