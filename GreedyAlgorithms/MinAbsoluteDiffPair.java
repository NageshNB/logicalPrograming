package GreedyAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinAbsoluteDiffPair {
     
    public static void main(String[] args) {
        int a[] = {4,1,8,7};
        int b[] = {2,3,6,5};
        int minAbs = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i < a.length; i++){
            minAbs += Math.abs(a[i] - b[i]);
        }

        System.out.println("Min absolute value = "+minAbs);

    }
}
