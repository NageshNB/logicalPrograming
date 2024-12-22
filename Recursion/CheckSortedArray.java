package Recursion;

public class CheckSortedArray {
    static boolean checkArrayIsSorted(int indx, int[] arr){
        if(indx+1 == arr.length)
        return true;
        else if(arr[indx] <= arr[indx+1])
            return checkArrayIsSorted( indx+1, arr);
        else return false;
    }
    public static void main(String[] args) {
        int [] array = {1,2,13,4,5};
        System.out.println("Array is sorted:"+checkArrayIsSorted(0, array));
    }
}
