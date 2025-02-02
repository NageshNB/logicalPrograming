package BackTracking;

public class GridWays {

    static int findNumOfWays(int[][] arr, int row, int col){
        if(row == arr.length - 1 && col == arr[0].length -1){// condition for last cell
            return 1;
        }
        else if(row == arr.length - 1 || col == arr[0].length - 1){// boundry cross condn
            return 0;
        }

        return findNumOfWays(arr, row+1, col) + findNumOfWays(arr, row, col+1);

    }
   
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(findNumOfWays(arr, 0, 0));
    }
}
