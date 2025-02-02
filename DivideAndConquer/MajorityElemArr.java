package DivideAndConquer;

public class MajorityElemArr {
    
    // majority element is the element that appears more than ⌊n/2⌋ times
    static int majorityElement(int[] arr, int si, int ei){

        //base case, if only one element in the arr
        if(si == ei){
            return arr[si];
        }

        //recursion on left and right halves of this slice
        int mid = (ei-si)/2 + si;
        int left = majorityElement(arr, si, mid);
        int right = majorityElement(arr, mid+1, ei);

        //if 2 halves majority is same, return any one
        if(left == right){
            return  left;
        }

        //other wise count each ele and return majority ele
        int leftCount = countRange(arr, si, ei, left);
        int rightCount = countRange(arr, si, ei, right);

        return leftCount > rightCount? left : right;
    }

    static int countRange(int arr[], int si, int ei, int num){
        int count = 0;

        for(int i = si; i <= ei; i++){
            if(arr[i] == num){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr,0,arr.length-1));
    }
}
