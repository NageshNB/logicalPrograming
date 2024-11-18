import java.util.Scanner;

class BinaryToDecimal{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the binary num");
        int binryVal=scan.nextInt();
        binToDec(binryVal);
    }
    static void binToDec(int binVal){
       
       
            int decVal = 0;
            int pow = 0;            

            while (binVal > 0) {
                if (binVal % 10 == 1) {
                    decVal += (int) Math.pow(2, pow);
                }
                binVal /= 10; // Move to the next binary digit
                pow++;        // Increment the power for the next digit
            }

            System.out.println("decimal value is = " + decVal);
        

    }
}