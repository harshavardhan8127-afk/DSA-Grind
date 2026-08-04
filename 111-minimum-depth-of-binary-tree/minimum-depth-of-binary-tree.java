/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {

        //Base case
        if(root == null){
            return 0;
        }

        // if only the right exists
        if(root.left == null){
            return minDepth(root.right) + 1;
        }
        // if only the left exists
        if(root.right == null){
            return minDepth(root.left) + 1;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        //minDepth we use the Math.min()
        return Math.min(left,right) + 1;
    }
}