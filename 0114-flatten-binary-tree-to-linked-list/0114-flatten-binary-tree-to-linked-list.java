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
    public void flatten(TreeNode root) {
        if(root == null) return;
        TreeNode lt = root.left;
        TreeNode rt = root.right;
        root.left = null;
        flatten(lt);
        flatten(rt);
        root.right = lt;
        TreeNode temp = lt;
        while(temp != null && temp.right != null) {
            temp = temp.right;
        }
        if(temp != null) temp.right = rt;
        else root.right = rt;
        return;
    }
}