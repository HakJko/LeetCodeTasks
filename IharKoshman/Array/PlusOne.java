package IharKoshman.array;

import java.util.Arrays;

/**
 *  Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list,
 *      and each element in the array contains a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * [4, 3, 2, 1] -> [4, 3, 2, 2]
 */

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {4, 3, 2, 1};

        int[] res = plusOne(digits);
        System.out.println(Arrays.toString(res));
    }
    public static int[] plusOne(int[] digits) {
        digits[digits.length-1]++;
        return digits;
    }
}
