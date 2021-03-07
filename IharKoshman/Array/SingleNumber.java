package IharKoshman.Array;

/**
 * Given a non-empty array of integers numbers, every element appears twice except for one.
 *      Find that single one.
 */

public class SingleNumber {
    public static void main(String[] args) {
        int[] numbers = {2, 2, 1, 4, 1};

        System.out.println(singleNumber(numbers));
    }
    public static int singleNumber(int[] numbers) {
        int res=0;
        for(int i:numbers){
            res^=i;
        }
        return res;
    }
}
