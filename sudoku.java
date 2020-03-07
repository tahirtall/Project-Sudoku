import java.util.stream.IntStream;

public class sudoku {
    
    // 0s represent blank spaces
    private static int[][] board = {
        {8, 0, 7, 1, 5, 0, 0, 9, 6},
        {0, 6, 5, 3, 0, 7, 1, 4, 0},
        {3, 4, 1, 0, 8, 0, 7, 0, 2},
        {5, 9, 3, 4, 6, 8, 2, 7, 0},
        {4, 0, 0, 0, 1, 0, 0, 0, 9},
        {0, 1, 8, 9, 7, 2, 4, 3, 5},
        {7, 0, 6, 0, 3, 0, 9, 1, 4},
        {0, 5, 4, 7, 0, 6, 8, 2, 0},
        {2, 3, 0, 0, 4, 1, 5, 0, 7}
    };

    // for comparison
    private static int[][] solvedBoard = {
        {8, 2, 7, 1, 5, 4, 3, 9, 6},
        {9, 6, 5, 3, 2, 7, 1, 4, 8},
        {3, 4, 1, 6, 8, 9, 7, 5, 2},
        {5, 9, 3, 4, 6, 8, 2, 7, 1},
        {4, 7, 2, 5, 1, 3, 6, 8, 9},
        {6, 1, 8, 9, 7, 2, 4, 3, 5},
        {6, 1, 8, 9, 7, 2, 4, 3, 5},
        {1, 5, 4, 7, 9, 6, 8, 2, 3},
        {2, 3, 9, 8, 4, 1, 5, 6, 7}
    };

    // Returns 2D Array of the Answer
	public static void showTheAnswer() {
        int counter = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                    counter++;
                    if (counter != 10) {
                        System.out.print(solvedBoard[i][j] + " ");
                    }
                }
            System.out.print("\n");
            counter = 0;
            }
        }

    // The table before solving
    public static void prepTheGame() {
        int counter = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                    counter++;
                    if (counter != 10) {
                        System.out.print(board[i][j] + " ");
                    }
                }
            System.out.print("\n");
            counter = 0;
            }
    }

    // Row constrains
    public static boolean checkRow() {
        // TODO
        return true;
    }

    // Column constrains
    public static boolean checkColumn() {
        // TODO
        return true;
    }

    // Checks constrains for row and column
    public static boolean rules(int[][] board, int row, boolean[] constrains, int column) {
        if (board[row][column] == 0) {
            if (!constrains[board[row][column]-1]) {
                constrains[board[row][column-1]] = true; 
            }
            else {
                return false;
            }
        }
        return true;
    }

    // Checks if row and column constraints clear out.
    public static boolean isValid() {
        // TODO
        return true;
    }

    // Takes the arraylist created by prepTheGame() and properly places all of the
    // numbers to create a completed Sudoku grid.
    public static int[][] solveTheGame(){
        return board;
    }

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Output:");
        prepTheGame();
        System.out.println("======================");
        System.out.println("Expected:");
        showTheAnswer();

	} 
}
