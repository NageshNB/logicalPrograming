package Recursion;

public class FindFirstOccurence {
    static int firstOccurence(int arr[], int key, int indx){
        if(indx == arr.length)
        return -1;
        if(arr[indx] == key)
        return indx;
        return firstOccurence(arr, key, indx+1);
    }

    public static void main(String[] args) {
        int []arr = {3,4,6,2,7,8,6};
        System.out.println("first occurence index is "+firstOccurence(arr, 6, 0));
    }

}