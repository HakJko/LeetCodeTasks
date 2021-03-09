package IharKoshman.array;

/**
 * Given an integer array numbers, return true if any value appears at least twice in the array,
 *      and return false if every element is distinct.
 */

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1};

        System.out.println(containsDuplicate(numbers));

    }
    public static boolean containsDuplicate(int[] numbers) {
        for (int i = 0; i < numbers.length; ++i) {
            for(int j = i+1; j<numbers.length; ++j) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
