package Stacks;

import java.util.Stack;

public class DuplicateParantheses {
    static boolean isDuplicPresent(String str){
       Stack<Character> s = new Stack<>();
       for(int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);
        if(ch == ')'){
            int count = 0;
            while(s.pop() != '('){
                count++;
            }
            if(count < 1){
                return true;
            }
        }else{
            s.push(ch);
        }
       }
       return false;
    }

    public static void main(String[] args) {
        String str = "(a+(a+b))";// balanced expression
        System.out.println(isDuplicPresent(str));
    }
}
