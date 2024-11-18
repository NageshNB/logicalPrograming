

import java.util.*;

public class Leapyear {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num");
        int primeNum = scan.nextInt();
        int count =0;
        for (int i =2; i<= Math.sqrt(primeNum);i++){

            if(primeNum%i==0)
                System.out.println(i);
        }
        if(count==0)
        System.out.println("Prime Num");
        else System.out.println("Not a Prime Num");

        System.out.println(Math.sqrt(primeNum));
        System.out.println(primeNum/2 + "ddd");
        char a ='a';
        a++;
        System.out.println(a);

    }
}