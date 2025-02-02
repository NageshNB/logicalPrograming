package ArrayListsProgram;

import java.util.ArrayList;

public class ContainerWithMostWater {

    // brute force
    // static int containerMostWater(ArrayList<Integer> arr){
    //     int si = 0;
    //     int mostWaterFilled = 0;
        
    //     while (si<arr.size()-1) {            
    //         for(int i= arr.size()-1; i>si; i--){
    //             int height = Math.min(arr.get(si), arr.get(i));
    //             int filledWater = height * (i - si);
    //             mostWaterFilled = Math.max(mostWaterFilled, filledWater);
    //         }
    //         si++;
    //     }

    //     return mostWaterFilled;
    // }

    // 2 pointer approach
    static int storedWater(ArrayList<Integer> arr){
        int si = 0, ei = arr.size()-1;
        int mostWaterFilled = 0;

        while (si < ei) {
            //calculate water area
            int width = ei - si;
            int currWater = width * Math.min(arr.get(si), arr.get(ei)) ;
            mostWaterFilled = Math.max(mostWaterFilled, currWater);
            //update ptr
            if(arr.get(si) < arr.get(ei)){
                si++;
            }
            else{
                ei--;
            }            
        }
        return mostWaterFilled;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        // System.out.println(containerMostWater(list));
        System.out.println(storedWater(list));
    }
}

