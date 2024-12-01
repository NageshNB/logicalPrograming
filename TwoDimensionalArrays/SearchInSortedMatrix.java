package TwoDimensionalArrays;

public class SearchInSortedMatrix {
    
    static void searchInSortedMatrix(int[][] matrix, int key){
        int row = -1, col = -1;

        for(int i = 0; i < matrix.length; i++){

            int start = 0;
            int end = matrix[i].length-1;

            while(start <= end){
                int mid = (start + end) / 2;
                if(matrix[i][mid] == key){
                    row = i;
                    col = mid;
                    break;
                }
                else if(matrix[i][mid] > key){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }
            if(row > -1) break;
        }
        if(row > -1){
            System.out.println("row:"+row+", col:"+col);
        }
        else System.out.println("Key not found");
    }

    public static void main(String[] args) {
        int matrix[][] = {  {1,2,3,4,5},
                            {6,7,8,9,10},
                            {11,12,13,14,15},  
                            {16,17,18,19,20},
                            {21,22,23,24,25}
                        };
        int key = 25;
        // searchInSortedMatrix(matrix, key); // usind binary search
        keySearchMatrix(matrix, key);
    }

    static boolean keySearchMatrix(int[][] arr,int key){
        int row = 0, col = arr[0].length - 1;

        while(row <= arr.length - 1 && col >= 0){
            if(arr[row][col] == key){
                System.out.println("key found at array of row:"+row+" & col:"+col);
                return true;
            }
            else if(arr[row][col] > key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;

    }
}
