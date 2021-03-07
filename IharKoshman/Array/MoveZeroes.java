package IharKoshman.Array;

import java.util.Arrays;

/**
 * Given an array numbers, write a function to move all 0's to the end
 *      of it while maintaining the relative order of the non-zero elements
 */

public class MoveZeroes {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 12};

        int[] res = moveZeroes(numbers);
        System.out.println(Arrays.toString(res));
    }
    public static int[] moveZeroes (int[] numbers) {
        int count=0;
        int length = numbers.length;
        for (int i = 0; i < length; ++i){
            if (numbers[i] != 0) {
                numbers[count++] = numbers[i];
            }
        }
        while (count < length) {
            numbers[count++] = 0;
        }
        return numbers;
    }

}
