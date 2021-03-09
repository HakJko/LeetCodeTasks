package IharKoshman.atrings;

/**
 * Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 */

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println("Is this Palindrome? --"+ str
                + "\n\tAnswer: " + isPalindrome(str));
    }
    public static boolean isPalindrome (String str) {
        str = str.toLowerCase();
        char c1 = ' ', c2 = ' ';
        for(int i = 0, j = str.length() - 1; i < j; ) {
            c1 = str.charAt(i);
            if(!isCharOrDigit(c1)) {
                i++;
                continue;
            }

            c2 = str.charAt(j);
            if(!isCharOrDigit(c2)) {
                j--;
                continue;
            }

            if(c1 != c2) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean isCharOrDigit(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= '0' && c <= '9');
    }
}
