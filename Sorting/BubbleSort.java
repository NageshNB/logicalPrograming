package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={2,5,6,1,3,4};
        bubbleSort(arr);
        printArr(arr);
    }

    static void bubbleSort(int arr[]){
        for(int turn =0; turn<arr.length-1; turn++){
            for(int j = 0; j< arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                //swapping
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]= temp;
                }
            }
        }
    }

    static void printArr(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
