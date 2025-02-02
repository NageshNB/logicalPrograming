package Stacks;

import java.util.Stack;

public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        
        StringBuilder sb = new StringBuilder("");
         while (!s.isEmpty()) {
            sb.append(s.pop());
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        String str = "12345";
        String result = reverseString(str);
        System.out.println(result);
    }
}
