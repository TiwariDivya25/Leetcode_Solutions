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
    private int s = 0;
    public int sumRootToLeaf(TreeNode root) {
        if(root == null) return 0;
        sum(root, 0);
        return s;
    }
    private void sum(TreeNode root, int num) {
        if(root == null) return;
        num = (num << 1) | root.val;
        if(root.left == null && root.right == null) {
            s += num;
            return;
        }
        
        sum(root.left, num);
        sum(root.right, num);
    }
}