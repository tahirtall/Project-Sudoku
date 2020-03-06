import java.util.Arrays;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class sudoku {
	public static void main(String[] args) throws IOException
	{
		List<List<Integer>> integers = new ArrayList<List<Integer>>(9);
		for (int i =0; i<9; i++) {
			integers.add(new ArrayList<Integer>(9));
		}
		Path filePath = Paths.get("numbers.txt");
		Scanner scanner = new Scanner(filePath);
		int num = 0;
		int counter = 0;
		while (num < 9) {
			while (counter < 9) {
					integers.get(num).add(scanner.nextInt());
					counter++;
			}
			num++;
			counter = 0;
		}
		System.out.print(integers);
	}
}
