package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
          Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int value = 590;
        int countOfCoins = 0;

        Arrays.sort(coins,Comparator.reverseOrder()); //if coins are not given in an order    

        for(int i=0; i<coins.length;i++){
            if(value >= coins[i]){
            while(value >= coins[i]){
                value -= coins[i];
                countOfCoins++;
            }}
        }
        System.out.println("max count is "+countOfCoins);


    }
}
