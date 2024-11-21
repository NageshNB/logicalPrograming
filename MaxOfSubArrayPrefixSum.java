public class MaxOfSubArrayPrefixSum {
    
    public static void main(String[] args) {
        
        //calculating the max of the sub array using 2 for loops(Prefix Sum)
        int array[] = {1,2,4,-5,6};
        prefixSumArray(array);
    }

    static void prefixSumArray(int arr[]){
        int arrLen = arr.length;
        int prefixSum[] = new int[arrLen];
        prefixSum[0]=arr[0];
        for(int i =1; i<arrLen;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        int maxVal = 0;
        for(int i = 0; i<arrLen;i++){
            int curSubArraySum = 0;
            for(int j = i;j<arrLen;j++){
                curSubArraySum = i == 0 ? prefixSum[j]: prefixSum[j]-prefixSum[i-1];

                if(maxVal<curSubArraySum)
                    maxVal = curSubArraySum;
            }
        }
        System.out.println("the max value is " +maxVal);
    }
}
