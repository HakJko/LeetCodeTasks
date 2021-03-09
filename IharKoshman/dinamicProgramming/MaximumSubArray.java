package IharKoshman.dinamicProgramming;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 *      which has the largest sum and return its sum.
 */

class SolutionMaxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int sum = 0;int largestSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length ; ++i){
            sum += nums[i];

            if(sum > largestSum){
                largestSum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return largestSum;
    }
}
