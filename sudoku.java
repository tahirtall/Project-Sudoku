import java.util.Arrays;

class sudoku
{
	public static void main(String[] args)
	{
		int[][] board = new int[3][3];
		// adding elements to the board.
		board[0][0] = 5;
		board[0][1] = 0;
		board[0][2] = 0;

		board[1][0] = 7;
		board[1][1] = 9;
		board[1][2] = 0;

		board[2][0] = 2;
		board[2][1] = 0;
		board[2][2] = 4;

		// Iterating through the grid.
		for (int row=0; row<3; row++)
		{
			for (int col=0; col<board[row].length; col++)
			{
				if (board[col].equals(0))
				{
					board[col] = board[1];
				}
			}
		}
		// Printing the array items
		System.out.print("[ " + board[0][0] + " " + board[0][1] + " " + board[0][2] + " \n" +
						 "  " +	board[1][0] + " " + board[1][1] + " " + board[1][2] + " \n" +
						 "  " +	board[2][0] + " " + board[2][1] + " " + board[2][2] + " ]");
		}
}
