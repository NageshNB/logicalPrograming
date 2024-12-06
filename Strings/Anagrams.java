package Strings;

import java.util.Arrays;

public class Anagrams {
    //strings contain the same characters but in a different order example : race and care.
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
System.out.println("str1 and str2 are anagrams: "+ checkAnagrams(str1, str2));
    }

    static boolean checkAnagrams(String str1, String str2){
        if(str1.length() == str2.length()){

            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            //converting to lowercase
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            //both arrays get sorted
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            //checking both arrays are equal
            boolean result = Arrays.equals(arr1, arr2);
            return result;
        }
        return false;
    }
}
