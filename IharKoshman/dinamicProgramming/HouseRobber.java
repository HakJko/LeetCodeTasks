package IharKoshman.dinamicProgramming;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
 *  the only constraint stopping you from robbing each of them is that adjacent houses have security system connected
 *  and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount
 *      of money you can rob tonight without alerting the police.
 */

class SolutionHR {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int n2 = 0, n1 = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            int n = Math.max(n1, n2 + nums[i]);
            n2 = n1;
            n1 = n;
        }
        return n1;
    }
}
