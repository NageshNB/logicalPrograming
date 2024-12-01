public class TrappingRainWater {
    public static void main(String[] args) {
        int height[] = {4,5,6,7,8};
        trappedWater(height);
    }

    static void trappedWater(int arr[]){
        int arrLen = arr.length;
        int lftMaxArr[] = new int[arrLen];
        int rightMaxArr[] = new int[arrLen];
        int totTrapWater = 0;

        // to find the max value of left side of arr
        lftMaxArr[0] = arr[0];
        for(int i = 1; i< arrLen;i++){
            
            lftMaxArr[i] = Math.max(arr[i], lftMaxArr[i-1]);
        }


        // to find the max value of right side of arr
        rightMaxArr[arrLen-1] = arr[arrLen-1];
        for(int i = arrLen-2; i>=0;i--){
            rightMaxArr[i] = Math.max(arr[i], rightMaxArr[i+1]);
        }

        //to find the total water trapped
         
        for(int i =0; i< arrLen; i++){
            int curVal = Math.min(lftMaxArr[i], rightMaxArr[i])  ;
            totTrapWater += curVal - arr[i];

        }

        System.out.println("the total water trapped is "+totTrapWater);
        
    }


    // solving trapping rain water in single loop
    // static int trappedWater(int arr[]){
    //     int arrLen = arr.length-1, l = 0, r = arrLen;
    //     int lMax = arr[l], rMax = arr[r];
    //     int res = 0;
    //     while(l<r){
    //         if(lMax < rMax){
    //             l++;
    //             lMax = Math.max(lMax, arr[l]);
    //             res += lMax - arr[l];
    //         }
    //         else{
    //             r--;
    //             rMax = Math.max(rMax, arr[r]);
    //             res += rMax - arr[r];
    //         }
    //     }
    //     return res;
    // }
    

}
