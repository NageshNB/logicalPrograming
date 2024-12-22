package DivideAndConquer;

public class MergeSort {
    static void mergeSort(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    static void merge(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei-si+1];
        int i = si;
        int j = mid +1;
        int k = 0;
         
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for remaining i 
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        // for remaining j
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy the temp values to array
        for(k=0, i=si; k<temp.length;k++, i++){
           arr[i] = temp[k]; 
           
        }
    }

    public static void main(String[] args) {
        int[] arr =  {4,3,2,5,1};
        mergeSort(arr, 0, arr.length-1);
        for(int i =0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
