package IharKoshman.trees;

/**
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

public class MaximumDepthOfBinaryTree {
    private int val;
    MaximumDepthOfBinaryTree left;
    MaximumDepthOfBinaryTree right;

    public MaximumDepthOfBinaryTree() {
    }

    public MaximumDepthOfBinaryTree(int val) {
        this.val = val;
    }

    public MaximumDepthOfBinaryTree(int val, MaximumDepthOfBinaryTree left, MaximumDepthOfBinaryTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {

    }
}

class Solution {
    public static int maxDepth(MaximumDepthOfBinaryTree root) {
        if(root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}