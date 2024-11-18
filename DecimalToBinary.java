import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of decimal value");
        int decVal = scan.nextInt();
        decimalToBinary(decVal);
    }
    static void decimalToBinary(int decVal){
        int orgVal = decVal;
        int pow =0;
        int binVal = 0;
        while(decVal>0){
            binVal = binVal + (int)((decVal%2) * Math.pow(10, pow));
            pow++;
            decVal /=2;
        }
        System.out.println("binary value of "+orgVal+ " is "+binVal);
    }
}
