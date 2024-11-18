import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        int key  = 22;
        
        System.out.println("the index of key is : "+ binSearch(arr,key));
    }

    static int binSearch(int[] arr, int key){
        int strt = 0, end = arr.length-1;
        
        while(strt<=end){
            int mid = (strt+end)/2;

            //comparison
             if(key == arr[mid])
                return mid;     //found

                else if(arr[mid]<key)
                    strt = mid +1;  //right

                else end = mid -1;  //left
        }
        return -1;
    }
}