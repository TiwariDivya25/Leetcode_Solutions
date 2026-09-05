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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        helper(root, targetSum, list, new ArrayList<>());
        return list;
    }
    public void helper(TreeNode root, int targetSum, List<List<Integer>> list, List<Integer> curr) {
        if(root == null) return;
        curr.add(root.val);
        if(root.left == null && root.right == null) {
            if(targetSum == root.val) {
                list.add(new ArrayList<>(curr));
            }
        }
        helper(root.left, targetSum-root.val, list, curr);
        helper(root.right, targetSum-root.val, list, curr);
        curr.remove(curr.size() - 1);
    }
}