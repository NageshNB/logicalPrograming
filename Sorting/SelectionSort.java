package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3,2,5,4,1};
        selectionSorting(arr);
        printArray(arr);
    }

    static void selectionSorting(int arr[]){
        for(int i =0 ; i< arr.length-1; i++){
            int minPos = i;
            for(int j=i+1 ; j<arr.length;j++){
                // selection sort in increasing order
                if(arr[minPos] > arr[j])
                    minPos = j;

                // selection sort in decreasing order
                // if(arr[minPos] < arr[j])
                //     minPos = j;
            }
            //swapping 
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }

    }

    static void printArray(int arr[]){
         //printing the array
         for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
