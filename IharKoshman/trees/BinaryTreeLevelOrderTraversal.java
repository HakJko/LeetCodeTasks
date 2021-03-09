package IharKoshman.trees;

/**
 * Given the root of a binary tree, return the level order traversal of its nodes' values.
 *  (i.e., from left to right, level by level).
 */

//class Solution {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        if(root==null){
//            return new ArrayList<>();
//        }
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> arr = new ArrayList<>();
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//        int currLevelSize = q.size();
//        int i=0;
//        while(q.size() != 0) {
//            TreeNode node = q.remove();
//            arr.add(node.val);
//            if(node.left != null)
//                q.add(node.left);
//            if(node.right != null)
//                q.add(node.right);
//            i++;
//            if(i==currLevelSize) {
//                res.add(arr);
//                currLevelSize = q.size();
//                i=0;
//                arr = new ArrayList<Integer>();
//            }
//        }
//        return res;
//    }
//}
