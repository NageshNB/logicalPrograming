package Recursion;

public class BinaryString {
    //print all the binary strings of size n without consecutive ones
    // static void printBinaryString(String str, int idx, int num){
    //     if(idx == num){
    //         System.out.println(str);
    //         return;
    //     }
    //     if(idx == 0){
    //         printBinaryString("1", idx+1, num);
    //         printBinaryString("0", idx+1, num);
    //     }
    //     else if(str.charAt(idx -1 ) != '1'){
    //         printBinaryString(str+"1", idx+1, num);
    //         printBinaryString(str+"0", idx+1, num);
    //     }
    //     else{
    //         printBinaryString(str+"0", idx+1, num);
    //     }
    // }


    static void printBinaryString(String str, int lastPlace, int num){
        if(num == 0){
            System.out.println(str);
            return;
        }
        printBinaryString(str+"0", 0, num-1);
        if(lastPlace == 0){
            printBinaryString(str+"1", 1, num-1);
        }
    }
    
    public static void main(String[] args) {
        // printBinaryString("", 0, 2);
    printBinaryString("", 0, 3);

    }
}

