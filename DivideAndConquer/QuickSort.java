package DivideAndConquer;

public class QuickSort {
    static void quickSort(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }

        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
         for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){// equal to also because if duplicates present
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        //swap
        arr[ei] = arr[i];
        arr[i] = pivot;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {8,3,6,4,2,7,5,-4};
        quickSort(arr,0,arr.length-1);
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
