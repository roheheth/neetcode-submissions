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
    public boolean isValidBST(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        inorder(root, lst);
        int value = Integer.MIN_VALUE;
        for(int i : lst){
            if(i > value){
                value = i;
            }else{
                return false;
            }
        }
        return true;
    }
    public void inorder(TreeNode root, List<Integer> lst){
        while(root == null){
            return;
        }
        inorder(root.left, lst);
        lst.add(root.val);
        inorder(root.right, lst);
    }
}
