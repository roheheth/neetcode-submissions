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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left_height = depth(root.left);
        int right_height = depth(root.right);
        int diameter = left_height + right_height;
        int sub = Math.max(diameterOfBinaryTree(root.right), diameterOfBinaryTree(root.left));
        return Math.max(diameter, sub);
    }

    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + (Math.max(depth(root.left), depth(root.right)));
    }
}
