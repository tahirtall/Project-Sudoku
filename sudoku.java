import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class sudoku {

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

	// Takes the arraylist created by prepTheGame() and properly places all of the
	// numbers to create a completed Sudoku grid.
	public static List<List<Integer>> playTheGame() throws IOException {
		List<List<Integer>> board = new ArrayList<List<Integer>>(9);
		board = prepTheGame();
		int counter = 1;
		for (int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				if (board.get(i).get(j) == 0) {
					if(board.get(i).contains(counter)) {
						counter++;
					}
					board.get(i).set(j, counter);
					counter++;
				}
			}
			counter = 0;
		}
		return board;
	}
	public static void main(String[] args) throws IOException
	{
		List<List<Integer>> board = new ArrayList<List<Integer>>(9);
		board = playTheGame();
		System.out.print("[" + board.get(0) + "\n");
		for (int i=1; i<8; i++) {
			System.out.print(" " + board.get(i) + "\n");
		}
		System.out.print(" " + board.get(8) + "]");
	}
}
