Project-Sudoku:

Sudoku Rules:

        -> numbers of 1-9 used
        -> made up of 9x9 square, divided in to 3x3 squares in itself.
        -> each 3x3 square has to be filled with number 1-9 without having any repeating number.
        -> numbers in rows and columns of 9x9 square can't be repeating as well.

My Rules:
        
        -> 0s will be representing blank spaces.

Progress:

        -> Iterated through the 2D Array.
        -> Created a txt file and passed all of the integers that will be used to create the 2D ArrayList.
        -> Read in the file, and added all of the integers from the txt file to the arraylist.
        -> 0s are now being placed with numbers 1-9 without being repated in each subarray.

Current Goal:
        
        -> Check if rows have repeating numbers. if so, replace it with a number that hasn't been used yet. (a number between 1-9)

ArrayList:

        -> [[0, 7, 2, 0, 0, 4, 9, 0, 0][3, 0, 4, 0, 8, 9, 1, 0, 0][8, 1, 9, 0, 0, 6,2, 5, 4][7, 0, 1, 0, 0, 0, 0, 9, 5][9, 0, 0, 0, 0, 2, 0, 7, 0][0, 0, 0, 8, 0, 7, 0, 1, 2][4, 0, 5, 0, 0, 1, 6, 2, 0][2, 3, 7, 0, 0, 0, 5, 0, 1][0, 0, 0, 0, 2, 5, 7, 0, 0]]

Grid (after printing the arraylist properly):

        [0, 7, 2, 0, 0, 4, 9, 0, 0]
        [3, 0, 4, 0, 8, 9, 1, 0, 0]
        [8, 1, 9, 0, 0, 6, 2, 5, 4]
        [7, 0, 1, 0, 0, 0, 0, 9, 5]
        [9, 0, 0, 0, 0, 2, 0, 7, 0]
        [0, 0, 0, 8, 0, 7, 0, 1, 2]
        [4, 0, 5, 0, 0, 1, 6, 2, 0]
        [2, 3, 7, 0, 0, 0, 5, 0, 1]
        [0, 0, 0, 0, 2, 5, 7, 0, 0]

