package DivideAndConquer;

public class RotatedSortedArray {
    // i/p: sorted, rotated array with distinct no.s ( ascending order ), find indx of given key
    static int rotatedSortedArray(int arr[], int target, int si, int ei){

        if(si > ei){
            return -1;
        }
        
        int mid = (si + ei)/2;

        // case found
        if(arr[mid] == target) {
            return mid;
        }

        // arr[mid] on L1
        if(arr[si] <= arr[mid]){
            // case a
            if(arr[si] <= target && target <= arr[mid]){
               return rotatedSortedArray(arr, target, si, mid-1);
            }
            // case b
            return rotatedSortedArray(arr, target, mid+1, ei);
        }
        // arr[mid] on L2
        else{
            // case c
            if(arr[mid+1] <= target && target <= arr[ei]){
                return rotatedSortedArray(arr, target, mid+1, ei);
            }
            // case d
            return rotatedSortedArray(arr, target, si, mid-1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 4;
        System.out.println(rotatedSortedArray(arr,target,0,arr.length-1));
    }
}
