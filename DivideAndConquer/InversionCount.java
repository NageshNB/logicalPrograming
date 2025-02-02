package DivideAndConquer;

public class InversionCount {

    static int mergeInversionCount(int[] arr, int si, int ei){
        int invCount = 0;

        if(si < ei){
            int mid = (ei-si)/2 + si;
            invCount = mergeInversionCount(arr, si, mid);
            invCount += mergeInversionCount(arr, mid+1, ei);
            invCount += sortCount(arr, si, mid, ei);
        }
        return invCount;
    }

    static int sortCount(int[] arr, int si, int mid, int ei){
        int []temp = new int[ei-si+1];
        int i = si;
        int j = mid + 1;
        int k = 0, invCount = 0;

        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                invCount += (mid - i + 1);
                j++;
            }
            k++;
        }

        //for any missing i values
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //for any missing j values
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copying the values from temp arr to original arr
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
        return invCount;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,1,2,5};
        System.out.println(mergeInversionCount(arr, 0, arr.length-1));
    }
}
