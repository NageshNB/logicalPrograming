package BackTracking;

public class N_Queens {
    static int count = 0;
    
    static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //diag left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //diag right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    // to check all the possibilities of the n queens problem
    public static void queenBoard(char board[][], int row){

        if(row == board.length){
            // printBoard(board); // printing the no. of ways
            count++;
            return;
        }
    
        for(int i=0; i<board.length; i++){
            if(isSafe(board, row, i)){
                board[row][i] = 'Q';
                queenBoard(board, row+1);
                board[row][i] = 'X';
            }
        }
    }

    static void printBoard(char board[][]){
        System.out.println("---------  Chess Board  ---------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+ " ");                 
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
       
        char board[][] = new char[n][n];

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = 'X';
            }
        }
        queenBoard(board, 0);

        System.out.println(count);

        if(queenBoard02(board, 0)){
            System.out.println("Solution is Possible");
            printBoard(board);
        }
        else{
            System.out.println("Solution is not possible");
        }
    }


    // to print only one solution of N queens problem
    public static boolean queenBoard02(char board[][], int row){

        if(row == board.length){
            return true;
        }
    
        for(int i=0; i<board.length; i++){
            if(isSafe(board, row, i)){
                board[row][i] = 'Q';
                if(queenBoard02(board, row+1)){
                    return true;
                }
                board[row][i] = 'X';
            }
        }
        return false;
    }

}
