package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,4,2,5,1};
        insertionSorting(arr);
    }

    static void insertionSorting(int arr[]){
        for(int i =1; i<arr.length;i++){
            int cur = arr[i];
            int prev = i-1;
            for(int j = i-1; j>=0;j--){
                if(cur<arr[j]){
                    arr[j+1] = arr[j];
                    prev--;
                }
                else{
                    break;
                }
            }
            //insertion
            arr[prev+1] =cur;
        }

        // // using for and while loop
        // for(int i =1; i<arr.length;i++){
        //     int cur = arr[i];
        //     int prev = i-1;
        //     while(prev >= 0 && arr[prev] > cur){
        //             arr[prev+1] = arr[prev];
        //             prev--;                
        //     }
        //     //insertion
        //     arr[prev+1] =cur;
        // }

        //printing the array
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
