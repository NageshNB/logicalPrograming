package Recursion;

public class TowerOfHanoi {
    static void towerOfHanoi(String src, String helper, String des, int n){
        if(n == 1){
            System.out.println("Transfer disk "+n+" from "+ src+" to " +des);
            return;
        }
        towerOfHanoi(src, des, helper, n-1);
        System.out.println("Transfer disk "+n+" from "+ src+" to " +des);
        towerOfHanoi(helper, src, des, n-1);
    }

    public static void main(String[] args) {
        towerOfHanoi("Source", "Helper", "Destination", 3);
    }
}
