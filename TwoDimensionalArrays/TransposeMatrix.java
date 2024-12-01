package TwoDimensionalArrays;

public class TransposeMatrix {
    
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
        {4,5,6}};
        transposeMatrix(arr);
    }

    static void transposeMatrix(int[][] arr){
        int[][] trans = new int[arr[0].length][arr.length];

        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j < arr[0].length;j++){
                trans[j][i] = arr[i][j];
            }
        }

        for(int i = 0; i<trans.length;i++){
            for(int j = 0; j < trans[0].length;j++){
                
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
