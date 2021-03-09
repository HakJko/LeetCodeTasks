package IharKoshman.atrings;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 *  If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */

public class ReverseInteger {
    public static void main(String[] args) {
        int value = -123;
        System.out.println("Input: " + value);

    int resRevers = reverse(value);
    print(resRevers);
    int resSimpleRevers = cleanRevers(value);
    print(resSimpleRevers);
    }
    public static int reverse(int value) {
        int rev = 0;
        while (value != 0) {
            int pop = value % 10;
            value /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)){
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)){
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
    public static int cleanRevers(int revers) {
        long res = 0;
        while (revers != 0) {
            res = res * 10 + revers % 10;
            revers = revers / 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)res;
        }
    }
    public static void print (int res) {
        System.out.println("Output:" + res);
    }
}
