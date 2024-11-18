

import java.util.Scanner;

class Father {
    int fatherAge = 45;
    String fatherName = "Tom";
}

class Son extends Father { // Son is now a subclass of Father
    int sonAge = 15;
    String sonName = "Jerry";
}

public class UpcastingDowncasting {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Father father = new Son(); // Upcasting: Son to Father
        // System.out.println(father.fatherAge); // Accessing Father class property
        // System.out.println(father.fatherName); // Accessing Father class property

        Son son = (Son)father;
        // System.out.println("Downcasting");
        // System.out.println(son.fatherAge);
        // System.out.println(son.fatherName);
        // System.out.println(son.sonAge);
        // System.out.println(son.sonName);
        System.out.println("Enter val01");
        int val01 = scan.nextInt();
        System.out.println("Enter val02");
        int val02 = scan.nextInt();
        System.out.println("Enter opern");

        char opern = scan.next().charAt(0);
        switch(opern){
            case '+' : System.out.println(val01 + val02);
            break;
            case '-' : System.out.println(val01 - val02);
            break;
            case '*' : System.out.println(val01 * val02);
            break;
            case '/' : System.out.println(val01 / val02);
            break;
            case '%' : System.out.println(val01 % val02);
            break;
            default:System.out.println("default");
        }
    }
}
