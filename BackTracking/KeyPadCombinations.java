package BackTracking;

public class KeyPadCombinations {
    // static void combOfKeypad(String num[], String permut, int idx, String subStr){
    //     if(idx == permut.length()){
    //         System.out.println(subStr);
    //         return;
    //     }

    //     int idxNum = Integer.parseInt(permut.charAt(idx)+"");
    //     String currVal = num[idxNum - 2];

    //     for(int i = 0; i< currVal.length(); i++){
    //         combOfKeypad(num, permut, idx+1, subStr+currVal.charAt(i));
    //     }
    // }
    
    static final char[][] L = {{}, {}, {'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},
                                {'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};


    static void lettersCombination(String digits){
        int len = digits.length();
        if(len == 0){
            System.out.println("");
            return;
        }
        bfs(digits,0,len, new StringBuilder());
    }

    static void bfs(String digits, int pos, int len, StringBuilder subStr){
        // base condn
        if(pos == len){
            System.out.println(subStr);
            return;
        }

        char[] letters = L[Character.getNumericValue(digits.charAt(pos))];

        for(int i =0; i< letters.length; i++){
            bfs(digits, pos+1, len, new StringBuilder(subStr).append(letters[i]));
        }
    }
    public static void main(String[] args) {
        // String keypadNum[] = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; 
        // String permNum = "523";
        // combOfKeypad(keypadNum, permNum, 0, "");
        String digits ="23";
        lettersCombination(digits);
    }
}
