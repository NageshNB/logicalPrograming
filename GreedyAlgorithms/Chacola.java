package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class Chacola {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 };
        Integer costHor[] = { 4, 1, 2 };

        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        int minCostOfCut = 0;
        int h = 0, v = 0;
        int hp = 1, vp = 1;

        while (h < costHor.length && v < costVer.length) {
            if (costHor[h] <= costVer[v]) { // vertical cut
                minCostOfCut += (costVer[v] * hp);
                v++;
                vp++;
            } else {//horizontal cut
                minCostOfCut += (costHor[h] * vp);
                h++;
                hp++;
            }
        }

        while (h < costHor.length) {
            minCostOfCut += (costHor[h] * vp);
            h++;
            hp++;
        }

        while (v < costVer.length) {
            minCostOfCut += (costVer[v] * hp);
            v++;
            vp++;
        }

        System.out.println("Total cost of Cuts is "+minCostOfCut);
    }
}
