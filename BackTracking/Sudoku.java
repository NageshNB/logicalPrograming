package BackTracking;

public class Sudoku {

    static boolean sudokuSolver(int arr[][], int row, int col){
        //base condn
        if(row == 9){
            return true;
        }
        
        int nxtRow = row, nxtCol = col+1;
        if(col+1 == 9){
            nxtRow = row+1;
            nxtCol = 0;
        }

        if(arr[row][col] != 0){
            return sudokuSolver(arr, nxtRow, nxtCol);
        }

        for(int digit =1; digit<=9; digit++){
            if(isSafe(arr, row, col, digit)){
                arr[row][col] = digit;
                if(sudokuSolver(arr, nxtRow, nxtCol)){
                    return true;
                }
                arr[row][col] = 0;
            }
        }
        
        return false;
    }


    static boolean isSafe(int [][]arr, int row, int col, int num){

        //to check in same col diff rows
        for(int i=0; i< arr.length; i++){
            if( arr[i][col] == num){
                return false;
            }
        }

        // to check same row diff col
        for(int j=0; j<arr.length; j++){
            if(arr[row][j] == num){
                return false;
            }
        }

        // to check in 3x3 box
        int n= (row/3)*3;
        int m=  (col/3)*3;
        for(int i=n; i<n+3; i++){
            for(int j=m; j<m+3;j++){
                if(arr[i][j] == num){
                    return false;
                }
            }
        }

        return true;
    }

    static void printSudoku(int arr[][]){
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        
        System.out.println(sudokuSolver(array,0,0));
        printSudoku(array);
    }
}
