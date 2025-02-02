package ArrayListsProgram;

import java.util.ArrayList;

public class MostFRequentNum {
    //You are given an integer Array list nums. You are also given an integer key,which is present in nums.
    //For every unique integer target in nums,count the number of times target 
    // immediately follows an occurrence of key in nums. 
    // In other words, count the number of indices i such that:
    // 0 <= i <= nums.size() - 2,nums.get(i) == key and,nums.get(i+1) == target.
    // Return the target with the maximum count
    //Constraints:
    // ● 2 <= nums.size() <= 1000
    // ● 1 <= nums.get(i) <= 1000
    // ● Assume that the answer is unique

    static int findFRequentNum(ArrayList<Integer> list, int key){
        int res[] = new int[1000];

        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) == key){
                res[list.get(i)-1]++;
            }
        }

        int maxNum = Integer.MIN_VALUE;
        int solu =0;

        for(int j=0;j< 1000; j++){
            if(res[j] > maxNum)
            maxNum = res[j];
            solu = j+1;
        }
        return solu;
    }
}
