package BackTracking;

public class StringSubSets {
    public static void main(String[] args) {
        printSubsets("abc",0,"");
    }

    static void printSubsets(String str, int idx, String sb){
        if(idx == str.length()){ 
            if(sb == ""){
                System.out.println("null");
            }
            else{
                System.out.println(sb);
            }
            return;
        }

        printSubsets(str, idx+1, sb+str.charAt(idx));
        printSubsets(str, idx+1, sb);
    }
}
