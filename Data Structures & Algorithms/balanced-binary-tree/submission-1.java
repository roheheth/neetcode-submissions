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
        if(root == null){
            return true;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        int lh = depth(left);
        int rh = depth(right);
        if(Math.abs(lh-rh)>1){
            return false;
        }else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
    public int depth(TreeNode r){
        if(r == null){
            return 0;
        }
        return 1 + (Math.max(depth(r.left), depth(r.right)));
    }
}
