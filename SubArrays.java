public class SubArrays {
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        //for sub arr it should be continuous part the arr
        printSubArrays(arr); 
    }
    static void printSubArrays(int []arr){
        int len = arr.length;
        int subArrTot[] = new int[(len*(len+1))/2];
        int ts = 0;
        for(int i = 0; i < len; i++){
            // number of elemns in sub arr
            for(int j = i; j < len; j++){
                //printing the sub arrays
                int totOfsubarr = 0;
                for(int k = i; k < j+1; k++){
                    System.out.print(arr[k]+" ");
                    totOfsubarr = totOfsubarr + arr[k];
                }
                subArrTot[ts] = totOfsubarr;
                ts++; 
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays = " + ts);
        maxAndMinOfArr(subArrTot);
    }

    static void maxAndMinOfArr(int arr[]){
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++ ){
            if(maxVal < arr[i])
                maxVal = arr[i];

            if(minVal > arr[i])
                minVal = arr[i];
        }

        System.out.println("max value in sub array is "+maxVal);
        System.out.println("min value in sub array is "+minVal);
    }
}
