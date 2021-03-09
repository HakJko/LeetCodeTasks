package IharKoshman.array;

/**
 * Determine if a 9 x 9 Sudoku board is valid.
 *      Only the filled cells need to be validated according to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 */

public class ValidSudoku {
    public static void main(String[] args) {
/**
 * Input: board =
 * [["5","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: true
 */
    }
    public static boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] boxes = new int[9];
        for (int i = 0; i < 81; i++) {
            int row = i / 9;
            int col = i % 9;
            int box = 3 * (row / 3) + col / 3;


            char cell = board[row][col];
            if (cell == '.') continue;
            int num = Character.getNumericValue(cell);
            // check if bit at index num-1 == 1, if so already visited
            int row_valid = ((rows[row] & (1 << (num - 1))) >> (num - 1));
            int col_valid = ((cols[col] & (1 << (num - 1))) >> (num - 1));
            int box_valid = ((boxes[box] & (1 << (num - 1))) >> (num - 1));

            if (row_valid == 1 || col_valid == 1 || box_valid == 1) return false;

            // set bit at index num - 1 to 1
            rows[row] |= (1 << num-1);
            cols[col] |= (1 << num-1);
            boxes[box] |= (1 << num-1);

        }
        return true;
    }
}