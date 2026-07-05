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
    public int idx = 0; 
    public TreeNode bstFromPreorder(int[] preorder) {
        return preorder(preorder, Integer.MAX_VALUE);
    }
    public TreeNode preorder(int[] pre, int bound) {
        if(idx == pre.length || pre[idx] > bound) return null;
        TreeNode root = new TreeNode(pre[idx++]);
        root.left = preorder(pre, root.val);
        root.right = preorder(pre, bound);

        return root;
    }
}