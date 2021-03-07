package IharKoshman.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers numbers and an integer target,
 *      return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution,
 *      and you may not use the same element twice.
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2, 11, 7, 15};
        int target = 9;

        List<Integer> res = twoSum(numbers, target);
        System.out.println(res);
    }
    public static List<Integer> twoSum(int[] numbers, int target) {
        List<Integer> listIndexes = new ArrayList<>();
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = 0; j < numbers.length; ++j) {
                int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    listIndexes.add(i);
                    listIndexes.add(j);
                }
                break;
            }
        }
        return listIndexes;
    }
}
