package ArrayListsProgram;

import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumbers {
    // static ArrayList<Integer> isLonely(ArrayList<Integer> list){
    //     ArrayList<Integer> lonelyNum = new ArrayList<>();
        
    //     for(int i =0; i< list.size();i++){
            
    //         if(isLonelyNum(list, i)){
    //             lonelyNum.add(list.get(i));
    //         }           
            
    //     }
    //     return lonelyNum;
    // }

    // static boolean isLonelyNum(ArrayList<Integer> list,int idx){
    //     int curNum = list.get(idx);
    //     if(idx == 0 )
    //         return (curNum != list.get(idx+1) -1) && (curNum != list.get(idx+1) +1);

    //     if(idx == list.size()-1)
    //         return (curNum != list.get(idx-1) -1) && (curNum != list.get(idx-1) +1);

    //     return (curNum != list.get(idx+1) -1) && (curNum != list.get(idx+1) +1) && (curNum != list.get(idx-1) -1) && (curNum != list.get(idx-1) +1);
    // }

    static ArrayList<Integer> fndLonely(ArrayList<Integer> list){
        ArrayList<Integer> lonely = new ArrayList<>();
        Collections.sort(list);
        for(int i =1; i< list.size()-1;i++){
            if(list.get(i-1)+1 < list.get(i) && list.get(i)+1 < list.get(i+1)){
                lonely.add(list.get(i));
            }
        }

        if(list.size() == 1){
            lonely.add(list.get(0));
        }

        if(list.size() > 1){
            if(list.get(0)+1 < list.get(1)){
                lonely.add(list.get(0));
            }
            if(list.get(list.size()-2)+1 < list.get(list.size()-1)){
                lonely.add(list.get(list.size()-1));
            }
        }
        return lonely;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        // System.out.println(isLonely(list));
        System.out.println(fndLonely(list));
    }
}
