package ArrayListsProgram;

import java.util.ArrayList;

public class PairSum1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSum1(list, 11));
    }

    static boolean pairSum1(ArrayList<Integer> list, int target){
        int lp =0, rp = list.size()-1;

        while(lp<rp){
            int currSum = list.get(lp)+list.get(rp);
            // case 1
            if(currSum == target){
                return true;
            }
            // case 2
            if(currSum < target){
                lp++;
            }
            // case 3
            else{
                rp--;
            }
        }
        return false;
    }
    
}
