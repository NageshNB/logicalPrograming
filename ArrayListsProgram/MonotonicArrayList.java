package ArrayListsProgram;

import java.util.ArrayList;

public class MonotonicArrayList {

    //An Arraylist is monotonic if it is either monotone increasing or monotone decreasing
    //monotone increasing if for all i<=j, nums.get(i) <= nums.get(j)
    //monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j)
    static boolean checkArrayIsMonotonic(ArrayList<Integer> list){
        boolean monotInc = true;
        boolean monotDec = true;
         for(int i =0; i< list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                monotInc = false;
            }
            if(list.get(i) < list.get(i+1)){
                monotDec = false;
            }
         }
        
         return monotDec || monotInc;          
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(checkArrayIsMonotonic(list));
    }
}
