package IharKoshman.Strings;

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 */

public class ReverseString {
    public static void main(String[] args) {
        char[] input = { 'h', 'e', 'l', 'l', 'o'};

    revers(input);
    print(input);
    }
    public static void revers (char[] input) {
        int left = 0;
        int right = input.length - 1;
        while (left < right) {
            char tmp = input[left];
            input[left++] = input[right];
            input[right--] = tmp;
        }
    }
    public static void print (char[] input) {
        for (char symbol : input) {
            System.out.print(symbol);
        }
    }
}
