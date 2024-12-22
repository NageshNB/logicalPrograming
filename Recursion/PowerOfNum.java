package Recursion;

public class PowerOfNum {
    // //time complexity is O(n)
    // static int findPowOfNum(int num, int pow){
    //     if(pow == 0){
    //         return 1;
    //     }

    //     return num * findPowOfNum(num, pow -1);
    // }

    // //time complexity is O(n)
    // static int findPowOfNum(int num, int pow){
    //         if(pow == 0){
    //             return 1;
    //         }
    //         if(pow % 2 == 0){
    //             return findPowOfNum(num, pow/2) * findPowOfNum(num, pow/2);
    //         }

    //         return num * findPowOfNum(num, pow/2) * findPowOfNum(num, pow/2);
    //     }

    //time complexity is O(logn)
    static int findPowOfNum(int num, int pow){
        if(pow == 0){
            return 1;
        }
        int halfPow = findPowOfNum(num, pow/2);

        if(pow % 2 == 0){
            return halfPow * halfPow;
        }

        return num * halfPow * halfPow;
    }

    public static void main(String[] args) {
        int num = 2;
        int pow = 5;
        System.out.println("Power of number "+ num + " is "+ findPowOfNum(num, pow));
    }
}
