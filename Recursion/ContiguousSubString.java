package Recursion;

public class ContiguousSubString {
    // find the contiguous substrings starting ending with same character
    // static int findContiguousSubString(String str, int count){
    //     if(str.length() == 1){
    //         count++;
    //          return count;
    //     }
    //     if(str.charAt(0)== str.charAt(str.length()-1))
    //     count++;

    //     return findContiguousSubString(str.substring(0, str.length()-1), count) + findContiguousSubString(str.substring(1, str.length()), 0);
    // }

    static int findContiguousSubString(String str, int i, int j, int n){
        if(n == 1 || n == 0 ) return n;
        int res = findContiguousSubString(str, i+1, j, n-1)+
        findContiguousSubString(str, i, j-1, n-1) -
        findContiguousSubString(str, i+1, j-1, n-2);

        if(str.charAt(i) == str.charAt(j)){
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        // System.out.println(findContiguousSubString("aac", 0));
        String str ="aabc";
        int i = 0, j = str.length()-1, n = str.length();
        System.out.println(findContiguousSubString(str, i,j,n));

    }
    
}