package ArrayListsProgram;

import java.util.ArrayList;

public class BeautifulArraylist {

    static boolean getBeautifulArrayUntil(ArrayList<Integer> list, int n){
        //base condn
        if(list.size() == n){
            return true;
        }

        // calcul
        for(int i =1; i<= n; i++){
            if(!isSafe(list,i)){
                list.add(i);
                if(getBeautifulArrayUntil(list, n)){
                    return true;
                }
                list.remove(i);
                System.out.println(list);
            }
        }
        return false;
    }

    static void getBeautifulArray(int n){
        ArrayList<Integer> list = new ArrayList<>();
        if(getBeautifulArrayUntil(list, n)){
            System.out.println(list);
        }
        else{
            System.out.println("Beautiful number not present");
        }
    }

    static boolean isSafe(ArrayList<Integer> list, int n){
        for(int i =0; i<list.size();i++){
            if(list.get(i) == n){
              return true;}
        }
        if(list.size() > 2){
            int j = list.size()-1;
            int i = j-2;
            int k =i+1;
            return list.get(j)+list.get(i) == 2 * list.get(k);
        }
        return false;
    }
    public static void main(String[] args) {
        int n=4;
        getBeautifulArray(n);
    }
}