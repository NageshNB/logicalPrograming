package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    //if end time is sorted
    public static void activitySelection(int strtTime[], int endTime[]){
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1 activity
        maxAct = 1;
        ans.add(0);

        int lastEnd = endTime[0];
        for(int i=1; i<endTime.length; i++){
            if(strtTime[i] >= lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = endTime[i];
            }
        }

        System.out.println("Max activities = "+maxAct);
        for(int i = 0; i< ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int strt[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        activitySelection(strt, end);

        // for unsorted end time
        int strtTime[] = {5,8,5,0,3,1};
        int endTime[] = {9,9,7,6,4,2};
        actSelection(strtTime, endTime);
    }

    //if end time is not sorted
    public static void actSelection(int  strtTime[], int endTime[]){
        int arr[][] = new int[strtTime.length][3];

        for(int i=0; i<strtTime.length; i++){
            arr[i][0] = i;
            arr[i][1] = strtTime[i];
            arr[i][2] = endTime[i];
        }


        //lambda function -> Comparator.comparingDouble(o -> o[2])
        // sorting by column 2 (o -> o[2])
        Arrays.sort(arr,Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // first activity
        maxAct = 1;
        ans.add(arr[0][0]);

        int lastEnd = arr[0][2];
        for(int i = 1; i<strtTime.length; i++){
            if(arr[i][1] >= lastEnd){
                maxAct++;
                ans.add(arr[i][0]);
                lastEnd = arr[i][2];
            }
        }

        System.out.println("Max activities = "+maxAct);
        for(int i = 0; i< ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
