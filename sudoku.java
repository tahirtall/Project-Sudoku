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
    public void prepTheGame() {
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

    // Row constraints
    public static boolean checkRow(int[][] board, int row) {
        boolean[] constraint = new boolean[9];
        return IntStream.range(0, 9).allMatch(column -> rules(board, row, constraint, column));
    }

    // Column constraints
    public static boolean checkColumn(int[][] board, int column) {
        boolean[] constraint = new boolean[9];
        return IntStream.range(0, 9).allMatch(row -> rules(board, row, constraint, column));
    }

    // Subgrid constraints
    public static boolean subGrid(int[]][] board, int row, int column) {
        //TODO
    }

    // Checks constrains for row and column
    public static boolean rules(int[][] board, int row, boolean[] constraint, int column) {
        if (board[row][column] != 0) {
            if (!constraint[board[row][column] - 1]) {
                constraint[board[row][column - 1]] = true;
            } else {
                return false;
            }
        }
        return true;
    }

    // Checks if row and column constraints clear out.
    public static boolean isValid(int[][] board, int row, int column) {
        return checkColumn(board, column) && checkRow(board, row);
    }

    // Takes the arraylist created by prepTheGame() and properly places all of the
    // numbers to create a completed Sudoku grid.
    public boolean solveTheGame(int[][] board) {
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (board[i][j] == 0) {
                    for (int k = 1; k <= 9; k++) {
                        board[i][j] = k;
                        if (isValid(board, i, j) && solveTheGame(board)) {
                            return true;
                        }
                        board[i][j] = 0;
                    }
                    return false; }}}
        return true;
    }

    public static void main(String[] args) {
        sudoku solve = new sudoku();
        solve.solveTheGame(board);

        System.out.println(" ");
        System.out.println("Output:");
        solve.prepTheGame();
        System.out.println("======================");
        System.out.println("Expected:");
        showTheAnswer();

	} 
}
