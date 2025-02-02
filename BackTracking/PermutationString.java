package BackTracking;

public class PermutationString {
    public static void main(String[] args) {
        findPermutation("abc", "");
    }

    static void findPermutation(String str, String newStr){
        if(str.length() == 0){
            System.out.println(newStr);
            return;
        }
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            String subStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(subStr, newStr+ch);
        }
    }
}
