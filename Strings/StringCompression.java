package Strings;

public class StringCompression {

    static String compressingString(String str){
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        for(int i = 0; i < str.length(); i++){
            if(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            else{
                sb.append(str.charAt(i));
                if(count > 1){
                    sb.append(count);
                }
                count = 1;

            }            
        }
        
        // for(int i = 0; i < str.length(); i++){
        //     count = 1;
        //     while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
        //         count++;
        //         i++;
        //     }
        //     sb.append(str.charAt(i));
        //         if(count > 1){
        //             sb.append(count);
        //         }
        // }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        String str = "aaabbccddf";
        System.out.println(compressingString(str));
    }
}
