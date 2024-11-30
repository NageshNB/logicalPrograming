package Sorting;

public class CountingSort {
    //to do count sort, array should be positive integers
    static void countingSort(int arr[]){
        int maxNum = Integer.MIN_VALUE;

        for(int i =0; i< arr.length;i++){
            maxNum = Math.max(maxNum, arr[i]);
        }

        int sortedCount[] = new int[maxNum +1];// since 0 is also positive num, we'll add +1 to maxNum
        for(int i = 0; i < arr.length; i++){
            sortedCount[arr[i]] = sortedCount[arr[i]] + 1;
        }
        
        //sorting based on the count
        int iterate = 0;
        for(int i = 0; i< sortedCount.length; i++){
            int count = sortedCount[i];
            while(sortedCount[i]>0){
                arr[iterate] = i;
                iterate++;
                sortedCount[i]--;
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,1,3,0,7,4,3,2};
        countingSort(arr);
    }
}
