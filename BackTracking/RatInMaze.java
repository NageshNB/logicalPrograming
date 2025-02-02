package BackTracking;

public class RatInMaze {

    // static void mazeSolver(int[][] maze, int row, int col, int[][] solu,String routeFrom){
    //     //base condn
    //     if(row == maze.length-1 && col == maze.length-1 && maze[row][col] == 1){
    //         solu[row][col] = 1; 
    //         printMazeSolu(solu);
    //         return;
    //     }

    //     // check is the cur block is open or closed
    //     if(maze[row][col] == 1){
    //         solu[row][col] = 1;
    //         //moving up
    //         if(row > 0 && routeFrom != "down"){
    //            mazeSolver(maze, row - 1, col, solu,"Up"); 
    //         }

    //         //moving down
    //         if(row < maze.length-1 && routeFrom != "Up"){
    //             mazeSolver(maze, row+1, col, solu,"down");
    //         }
            
    //         //moving left
    //         if(col > 0 && routeFrom != "right"){
    //             mazeSolver(maze, row, col-1, solu,"left");
    //         }

    //         //moving right
    //         if(col < maze.length-1 && routeFrom != "left"){
    //             mazeSolver(maze, row, col+1, solu,"right");
    //         }
    //         solu[row][col] = 0;
    //     }
    // }

    static boolean solveMaze(int [][]maze){
        int[][] solu = new int[maze.length][maze.length];

        // Validate start and end cells
        if (maze[0][0] == 0 || maze[maze.length - 1][maze.length - 1] == 0) {
            System.out.println("No solution exists");
            return false;
        }

        if(solveMazeUntil(maze, 0, 0, solu)){
            printMazeSolu(solu);
            return true;
        }
        return false;
    }

    static boolean solveMazeUntil(int[][] maze, int row, int col,  int[][] solu){
        // base condn
        if(row == maze.length-1 && col == maze.length-1 && maze[row][col] == 1){
            solu[row][col] = 1;
            return true;
        }

        if(isSafe(maze, row ,col)){
            if(solu[row][col] == 1){
                return false;
            }
            solu[row][col] = 1;

            // Move down
            if(solveMazeUntil(maze, row+1, col, solu)){
                return true;
            }

            // Move right
            if(solveMazeUntil(maze, row, col+1, solu)){
                return true;
            }

            // Move Up
            if (solveMazeUntil(maze, row - 1, col, solu)) {
                return true;
            }

            // Move Left
            if (solveMazeUntil(maze, row, col - 1, solu)) {
                return true;
            }
            solu[row][col] = 0;
        }

        return false;
    }

    static boolean isSafe(int[][] maze, int row, int col){
        return (row >= 0 && row < maze.length  && col >= 0 && col < maze.length && maze[row][col] == 1);
    }

    static void printMazeSolu(int[][] solu){
        System.out.println("--------------------------");
        for(int i =0; i< solu.length; i++){
            for(int j=0; j<solu.length; j++){
                System.out.print(solu[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] maze = {{ 1, 0, 0, 0, 0},
                        { 1, 1, 1, 1, 1},
                        { 1, 0, 1, 0, 1},
                        { 1, 1, 1, 0, 1},
                        { 1, 1, 1, 0, 1}};
        // mazeSolver(maze, 0, 0, new int[maze.length][maze.length],"");
        System.out.println(solveMaze(maze));// printing one solu
        // solveMaze2(maze); // printing all the posibilities of solu
    }

    static void solveMaze2(int [][]maze){
        int[][] solu = new int[maze.length][maze.length];

        // Validate start and end cells
        if (maze[0][0] == 0 || maze[maze.length - 1][maze.length - 1] == 0) {
            System.out.println("No solution exists");
            return ;
        }

        solveMazeUntil2(maze, 0, 0, solu);
    }

    static void solveMazeUntil2(int[][] maze, int row, int col,  int[][] solu){
        // base condn
        if(row == maze.length-1 && col == maze.length-1 && maze[row][col] == 1){
            solu[row][col] = 1;
            printMazeSolu(solu);
            return;
        }

        if(isSafe(maze, row ,col)){
            if(solu[row][col] == 1){
                return ;
            }
            solu[row][col] = 1;

            solveMazeUntil2(maze, row+1, col, solu);
            solveMazeUntil2(maze, row, col+1, solu);
            solveMazeUntil2(maze, row - 1, col, solu);
            solveMazeUntil2(maze, row, col - 1, solu);
            
            solu[row][col] = 0;
        }
    }   
    
}
