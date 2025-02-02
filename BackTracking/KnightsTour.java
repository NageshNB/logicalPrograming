package BackTracking;

public class KnightsTour {
        
    static int N = 8;
    static boolean isSafe(int[][] chessBoard,int row,int col){
        
        return (row >= 0 && row <chessBoard.length && col >= 0 && col < chessBoard.length && chessBoard[row][col] == -1 );
    }
    static void printChessBoard(int[][] chessBoard){
        for(int i =0 ; i < chessBoard.length; i++){
            for(int j=0; j< chessBoard.length; j++){
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
    }

    static boolean solveKnightTour(int[][] solChessBoard, int row, int col, int rowMove[], int colMove[], int num){
        
        if(num == (N * N)){
            return true;
        }
         
        
        for(int i =0; i<8; i++){
            int nextRow = row +rowMove[i];
            int nextCol = col +colMove[i];
            if(isSafe(solChessBoard, nextRow, nextCol)){
                solChessBoard[nextRow][nextCol] = num;
                if(solveKnightTour(solChessBoard, nextRow, nextCol, rowMove, colMove, num+1)){
                    return true;
                }
                else{
                    solChessBoard[nextRow][nextCol] = -1;
                }
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        
        int[] rowMove ={2,1,-1,-2,-2,-1,1,2};
        int[] colMove ={-1,-2,-2,-1,1,2,2,1};
        int[][] chessBoard = new int[N][N];
        for(int i =0 ; i < chessBoard.length; i++){
            for(int j=0; j< chessBoard.length; j++){
                chessBoard[i][j] = -1;
            }
        }
        chessBoard[0][0] = 0;
        if(!solveKnightTour(chessBoard,0,0,rowMove,colMove,1)){
            System.out.println("Solution does not exists");
        }
        else{
            printChessBoard(chessBoard);
        }
    }
    
}