public class PairsInArray {
    
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6};
        possiblePairs(array);
    }

    static void possiblePairs(int []arr){
        int totPairs = 0;
        int arrLen = arr.length;
        for(int i=0 ; i<arrLen-1;i++){

            for(int j = i+1;j<arrLen;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
                totPairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs : "+totPairs);
    }
}
