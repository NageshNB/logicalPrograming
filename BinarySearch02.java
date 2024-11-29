public class BinarySearch02 {
    public static void main(String[] args) {
        int[] arr = {25,26,30,1,3,5,8,9,21};
        System.out.println(findIndexInArray(arr, 26));
        System.out.println(3/2);
    }

    //getting index of the number when ascending arry is rotated right based on given number
    static int findIndexInArray(int[] arr, int num){
        int mid =arr.length/2;
        int strt = 0;
        int end = arr.length -1;
        if(arr[mid] == num)
            return mid;

        for(int i = strt; i<= end; i++){
            mid = (strt + end)/2;
            if(arr[mid] == num)
            return mid;
            else if(num < arr[mid] && num >= arr[strt])
                end = mid-1;
            else strt = mid+1;
        }
        return -1;
    }
}
