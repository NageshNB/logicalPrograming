package ArrayListsProgram;

import java.util.ArrayList;

public class PairSum2 {

    static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp = -1;
        for(int i=0; i<list.size()-1;i++){
            if(list.get(i) > list.get(i+1)){
                bp=i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;

        while(lp != rp){
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //case 2
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp + 1)%list.size();
            }
            //case 3
            else{
                rp = (list.size()+rp-1)%list.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();        
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(pairSum2(list, 1));
    }
}
