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
    public boolean isBalanced(TreeNode root) {

       return Height(root) != -1;
    }
    int Height(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = Height(root.left);
        int right = Height(root.right);

        //this check the subtree is unbalanced in the middle then sends -1 directly
        if(left == -1 || right == -1) return -1;

        //checking of the tree is sub trees is balanced or not 
        if(Math.abs(left - right) > 1) return -1;

        // this is similar to height of the tree
        return Math.max(left,right) + 1;
    }
}