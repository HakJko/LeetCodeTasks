package IharKoshman.Strings;

/**
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

public class ImplementstrStr {
    public static void main(String[] args) {
        String hayStack = "aaaaa";
        String needle = "bba";
    int res = strStr(hayStack, needle);
        System.out.println(res);

    }
    public static int strStr(String hayStack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        if(!hayStack.contains(needle)) {
            return -1;
        }

        int i = 0, count = 0;

        for (int v = 0; v < hayStack.length(); ++v) {
            for (int j = v; j < hayStack.length(); ++j) {
                if (needle.charAt(i) == hayStack.charAt(j)) {
                    count++;
                    i++;

                } else {
                    count = 0;
                    i = 0;
                    break;
                }

                if (count == needle.length()) {
                    return (j-(needle.length()-1));
                }
            }
        }
        return -1;
    }
}
