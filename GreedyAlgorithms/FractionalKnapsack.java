package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void fractionalKnapsack(int weight[], int value[],int capacity){
        double ratio[][] = new double[weight.length][2];
        
        for(int i =0 ; i< weight.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        double maxTotVal = 0;
        for(int i = ratio.length -1; i >= 0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                maxTotVal += value[idx];
                capacity -= weight[idx];
            }else{
                maxTotVal += capacity * ratio[i][1];
                capacity = 0;
                break;
            }
        }

        System.out.println("Max total value = "+maxTotVal);
    }

    public static void main(String[] args) {
        int weight[] = {10,20,30};
        int value[] = {60,100, 120};
        int capacity = 50;
        fractionalKnapsack(weight, value, capacity);
    }
}
