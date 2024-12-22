package Recursion;

public class Fibonacci {


    static int calNthFibonacci(int n){
        if(n == 0 || n == 1) return n;

        int fnm1 = calNthFibonacci(n-1);
        int fnm2 = calNthFibonacci(n-2);

        int fb = fnm1 + fnm2;// fibonacci of Nth term is (n - 1)  + (n - 2) terms

        return  fb;

    }

    public static void main(String[] args) {
        System.out.println(calNthFibonacci(6));
    }
}