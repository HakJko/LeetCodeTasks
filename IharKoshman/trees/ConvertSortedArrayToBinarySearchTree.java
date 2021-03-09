package IharKoshman.trees;

/**
 * Given an integer array nums where the elements are sorted in ascending order,
 *  convert it to a height-balanced binary search tree.
 *
 * A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
 */

//class Solution {
//    public TreeNode sortedArrayToBST(int[] nums) {
//        int left = 0;
//        int right = nums.length - 1;
//
//        return helper(nums, left, right);
//    }
//
//    public TreeNode helper(int[] nums, int left, int right){
//        if (left > right) return null;
//        int mid = left + (right - left) / 2;
//        TreeNode node = new TreeNode(nums[mid]);
//        node.left = helper(nums, left, mid - 1);
//        node.right = helper(nums , mid+1, right);
//        return node;
//    }
//}
