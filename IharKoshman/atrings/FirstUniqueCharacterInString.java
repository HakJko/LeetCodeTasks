package IharKoshman.atrings;

import java.util.HashMap;

/**
 * Given a string, find the first non-repeating character in it and return its index.
 *      If it doesn't exist, return -1.
 * You may assume the string contains only lowercase English letters.
 */

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String str = "love leet code";

    int index = firstUniqueChar(str);
        System.out.println(str);
        System.out.println(index);

    }
    public static int firstUniqueChar (String str) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = str.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
