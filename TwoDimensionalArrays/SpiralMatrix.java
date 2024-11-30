package TwoDimensionalArrays;

public class SpiralMatrix {
    
    public static void main(String[] args) {
        int matrix[][] = {  {1,2,3,4,5},
                            {6,7,8,9,10},
                            {11,12,13,14,15},  
                            {16,17,18,19,20},
                            {21,22,23,24,25}
                        };
        spiralMatrix(matrix);
    }

    static void spiralMatrix(int arr[][]){

        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;

        while (startRow <= endRow && startCol <= endCol) {
            
            //top 
            for(int i = startCol; i <= endCol; i++){
                System.out.print(arr[startRow][i] + " ");
            }

            //right
            for(int i = startRow + 1; i <= endRow ; i++){
                System.out.print(arr[i][endCol] + " ");
            }

            //bottom
            for(int i = endCol-1; i >= startCol; i--){
                if(startRow == endRow){//for 4*3 matrix it prints duplicate row values
                    break;
                }
                System.out.print(arr[endRow][i] + " ");
            }

            //left
            for(int i = endRow-1; i >= startRow+1; i--){
                if(startCol == endCol){//for 3*4 matrix it prints duplicate col values
                    break;
                }
                System.out.print(arr[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }


}
