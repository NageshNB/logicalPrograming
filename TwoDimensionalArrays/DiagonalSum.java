package TwoDimensionalArrays;

public class DiagonalSum {
    
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        diagonalSum(matrix);
    }

    static void diagonalSum(int arr[][]){
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            //primary diagonal
            sum += arr[i][i]; 

            //secondary diagonal
            if(i+i != arr.length-1){
                sum += arr[i][i];
            }
        }

        // //by brute force
        // for(int i = 0; i < arr.length ; i++){
        //     for(int j = 0; j < arr[0].length; j++){
        //         if(i == j){ //primary diagonal
        //             sum += arr[i][j];
        //         }
        //         else if(i+j == arr.length-1){ // always n*n matrix and not n*m matrix
        //             sum += arr[i][j]; //secondary diagonal
        //         }
        //     }
        // }
        System.out.println(sum);
    }
}
