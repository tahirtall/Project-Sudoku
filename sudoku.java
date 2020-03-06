import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class sudoku {
	// Returns 2D Array of the Answer
	public static List<List<Integer>> showTheAnswer() throws IOException {
		List<List<Integer>> board = new ArrayList<List<Integer>>(9);
		for (int i=0; i<9; i++) {
			board.add(new ArrayList<Integer>(9));
		}
		Path filePath = Paths.get("solved.txt");
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

	// returns index of the column and the row where 0 exists in the board.
	public static List<List<Integer>> indexMeZero(List<List<Integer>> s){
		int counter = -1;
		int counter2 = -1;
		List<List<Integer>> index = new ArrayList<List<Integer>>(9);
		for (int i=0; i<9; i++) {
			index.add(new ArrayList<Integer>());
		}
		for (int row=0; row<9; row++) {
			counter2++;
			if (s.get(row).contains(0)) {
				for(int col=0; col<9; col++) {
					counter++;
					if (s.get(row).get(col) == 0) {
						index.get(counter2).add(counter);
					}
				}
			}
			counter = -1;
		}
		return index;
	}


	// Takes the arraylist created by prepTheGame() and properly places all of the
	// numbers to create a completed Sudoku grid.
	public static List<List<Integer>> playTheGame() throws IOException {
		List<List<Integer>> index = new ArrayList<List<Integer>>(9);
		List<List<Integer>> board = new ArrayList<List<Integer>>(9);
		board = prepTheGame();
		return board;
	}

	public static void main(String[] args) throws IOException
	{
		List<List<Integer>> input = new ArrayList<List<Integer>>();
		List<List<Integer>> output = new ArrayList<List<Integer>>(9);
		List<List<Integer>> expected = new ArrayList<List<Integer>>(9);

		input = prepTheGame();
		output = playTheGame();
		expected = showTheAnswer();

		//indexes of the 0s.
		System.out.println("\nIndexes of 0s:");
		System.out.println(indexMeZero(input));
		// Below prints input, output, and expected sudoku grids.
		System.out.println("Input:");
		System.out.print("[" + input.get(0) + "\n");
		for (int i=1; i<8; i++) {
			System.out.print(" " + input.get(i) + "\n");}
		System.out.print(" " + input.get(8) + "]\n");
		System.out.println("Output:");
		System.out.print("[" + output.get(0) + "\n");
		for (int i=1; i<8; i++) {
			System.out.print(" " + output.get(i) + "\n");}
		System.out.print(" " + output.get(8) + "]\n");
		System.out.println("Expected:");
		System.out.print("[" + expected.get(0) + "\n");
		for (int i=1; i<8; i++) {
			System.out.print(" " + expected.get(i) + "\n");}
		System.out.print(" " + expected.get(8) + "]\n");
		System.out.print(" ");
	} 
}
