package IharKoshman.atrings;

import java.util.Arrays;

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 */

public class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

    System.out.printf("Is %s(t) an anagram of %s(s)?\n ", t, s);
        System.out.println("\tAnswer with used Sorting: " + isAnagramWithSorting(s, t));

        System.out.println("\tAnswer with used HashTable: " + isAnagramWithHashTable(s, t));
    }
    public static boolean isAnagramWithSorting (String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
    public static boolean isAnagramWithHashTable (String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
