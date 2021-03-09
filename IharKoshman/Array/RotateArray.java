package IharKoshman.array;

import java.util.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */

public class RotateArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int key = 3;
    rotate(numbers, key);
        System.out.println(Arrays.toString(numbers));
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        int temp;
        int previous;
        for (int i = 0; i < k; ++i) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; ++j) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }
}
