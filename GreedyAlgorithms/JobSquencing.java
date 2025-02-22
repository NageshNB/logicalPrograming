package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Collections;

public class JobSquencing {
    static class  Job {
        int deadLine;
        int profit;
        int idx;
        Job(int d, int p, int i){
            deadLine = d ;
            profit = p;
            idx = i;
        }
        
    }
    public static void main(String[] args) {
        int[][] jobInfo = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i<jobInfo.length; i++){
            jobs.add(new Job(jobInfo[i][0], jobInfo[i][1], i));
        }

        //descending order of profit
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);
        
        ArrayList<Integer> seq = new ArrayList<>(); 
        int time = 0;
        int maxProfit = 0;

        for(int i=0; i<jobs.size(); i++){
            if(jobs.get(i).deadLine > time){
                maxProfit += jobs.get(i).profit;
                seq.add(jobs.get(i).idx);
                time++;
            }
        }

        System.out.println("Max Profit : "+maxProfit);
         
        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i)+" ");
        }
    }
}
