package DivideAndConquer;

public class StringMergeSort {
    static void sortString(String[] arr, int si, int ei){
        if(si>= ei ){
            return;
        }
        int mid = (si+ei)/2;

        sortString(arr, si, mid);
        sortString(arr, mid+1, ei);

        mergeSort(arr, si, mid, ei);
    }

    static  void mergeSort(String[] arr, int si,int mid, int ei){
        String[] temp = new String[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<= mid && j <= ei){
            if(arr[i].compareTo(arr[j]) < 0){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // remaining i
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        // remaining j
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //iterate all the value from temp to arr
        for(k=0,i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        String[] arr = {"sun","earth","mars","mercury"};
        sortString(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
