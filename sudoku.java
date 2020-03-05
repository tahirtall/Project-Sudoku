import java.util.Arrays;
import java.util.ArrayList;

class sudoku
{
	public static void main(String[] args)
	{
		// board array initialized.
		String[][] board = {{"5", "0", "0"}, {"7", "9", "0"}, {"2", "0", "4"}};
		String[][] newBoard = new String[3][3];

		// Iterating through the grid.
		for (int i=0; i<board.length; i++)
		{
			for (int j=0; j<board[i].length; j++)
			{
				if (board[i][j] == "0")
				{
					newBoard[i][j] = "1";
				}
				else {
					newBoard[i][j] = board[i][j];
				}
			}
		}
		// Printing the array items
		System.out.print("[ " + newBoard[0][0] + " " + newBoard[0][1] + " " + newBoard[0][2] + " \n" +
						 "  " +	newBoard[1][0] + " " + newBoard[1][1] + " " + newBoard[1][2] + " \n" +
						 "  " +	newBoard[2][0] + " " + newBoard[2][1] + " " + newBoard[2][2] + " ]");
		}
}
