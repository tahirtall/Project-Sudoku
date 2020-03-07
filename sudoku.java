import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
	public void showTheAnswer() {
        for (int i=0; i<9; i++) {
            for(int j=0; j=9; j++) {
                System.out.print(solvedBoard[i][j] + " ");
            }
        }
	}

	// Reads in the txt file, and creates a 2D Arraylist.
	public static List<List<Integer>> prepTheGame() throws IOException {
		List<List<Integer>> board = new ArrayList<List<Integer>>(9);
		for (int i =0; i<9; i++) {
			board.add(new ArrayList<Integer>(9));
		}
		Path filePath = Paths.get("numbers.txt");
		Scanner scanner = new Scanner(filePath);
		int num = 0;
		int counter = 0;
		while (num < 9) {
			while (counter < 9) {
					board.get(num).add(scanner.nextInt());
					counter++;
			}
			num++;
			counter = 0;
		}
		return board;
	}

    // Row constraints
    public static boolean checkRow(){
        // TODO
        return true;
    }

    // Column constraints
    public static boolean checkColumn() {
        // TODO
        return true;
    }
    
    // Checks if row and column constraints clear out.
    public static boolean isValid() {
        // TODO
        return true;
    }


	// Takes the arraylist created by prepTheGame() and properly places all of the
	// numbers to create a completed Sudoku grid.
	public static List<List<Integer>> playTheGame() throws IOException {
		List<List<Integer>> index = new ArrayList<List<Integer>>(9);
		List<List<Integer>> board = new ArrayList<List<Integer>>(9);
		board = prepTheGame();
		// TODO: Use index object to somehow check rows and columns and somehow edit down the correct number and return it.
		return board;
	}

	public static void main(String[] args) throws IOException
	{
        System.out.print(showTheAnswer());
	} 
}
