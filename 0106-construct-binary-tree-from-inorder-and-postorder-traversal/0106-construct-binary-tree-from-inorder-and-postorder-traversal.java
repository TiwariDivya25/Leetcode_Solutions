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
    public TreeNode helper(int[] inorder, int inlo, int inhi, int[] postorder, int polo, int pohi) {
        if(polo > pohi) return null;
        TreeNode root = new TreeNode(postorder[pohi]);
        int i = inlo;
        while(inorder[i] != postorder[pohi]) i++;
        int left = i - inlo;
        root.left = helper(inorder, inlo, i-1, postorder, polo, polo+left-1);
        root.right = helper(inorder, i+1, inhi, postorder, polo+left, pohi-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return helper(inorder, 0, n-1, postorder, 0, n-1);
    }
}