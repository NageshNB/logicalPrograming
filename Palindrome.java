import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value");
        int value = scan.nextInt();
        checkPalindrome(value);
        
    }

       static void checkPalindrome(int value){
        int duplicVal= 0;
        int num = value;

        while(num != 0){
            int reminder = num%10;
            duplicVal = duplicVal *10 + reminder;
            num /=10;
        }

        System.out.println(duplicVal == value);

    }
    
}
