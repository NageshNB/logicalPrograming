public class MaxOfSubArrayKadanesAlgorth {

    public static void main(String[] args) {
        int array[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanesAlgorithum(array);
    }

    static void kadanesAlgorithum(int arr[]){
        int maxVal = Integer.MIN_VALUE;
        int curSum =0;
         for(int i=0; i< arr.length;i++){
            curSum = curSum + arr[i] <= 0? 0 : curSum + arr[i];
            if(maxVal < curSum)
                maxVal = curSum;
         }


        //  for(int i=0; i< arr.length;i++){
        //     curSum = curSum + arr[i] ;

        //     if(curSum < 0)
        //         curSum = 0;

        //     if(maxVal < curSum)
        //         maxVal = curSum;
        //  }


         System.out.println("the max value is "+ maxVal);
    }
}