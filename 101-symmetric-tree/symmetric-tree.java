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
    public boolean isSymmetric(TreeNode root) {

        return isSame(root.left,root.right);

    }
    boolean isSame(TreeNode left,TreeNode right){

        // checking for the last elements
        if(left == null && right == null) return true;

        //if one is vale is present and other is null
        if(left == null || right == null) return false;

        // now checking the values
        if(left.val != right.val) return false;

        return isSame(left.left,right.right) && isSame(left.right,right.left);
    }
}