package IharKoshman.array;

/**
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 *
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 *      DO NOT allocate another 2D matrix and do the rotation.
 */

/**
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 */

public class RotateImage {
    public static void main(String[] args) {
        int [][] matrix = { {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};
rotateBy90Degrees(matrix);
print(matrix);

    }
    public static void rotateBy90Degrees (int[][] matrix) {
        int l = matrix.length;
        for (int i = 0; i < (l + 1) / 2; ++i) {
            for (int j = 0; j < l / 2; ++j) {
                int temp = matrix[l - 1 - j][i];
                matrix[l - 1 - j][i] = matrix[l - 1 - i][l - 1 - j ];
                matrix[l - 1 - i][l - 1 - j] = matrix[j][l - 1 -i];
                matrix[j][l - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
    public static void print(int[][] matrixRes) {
        for (int[] line : matrixRes){
            for (int value : line) {
                System.out.print(value + " ");
            }
            System.out.println("");
        }
    }
}
