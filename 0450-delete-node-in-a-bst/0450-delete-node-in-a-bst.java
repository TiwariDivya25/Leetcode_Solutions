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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if(root.val > key){
            root.left = deleteNode(root.left, key);
        } else if(root.val < key) {
            root.right = deleteNode(root.right, key);
        } else{
            if(root.left == null && root.right==null) {
                return null;
            } else if(root.left == null || root.right == null) {
                if(root.left != null){
                    TreeNode temp = root.left;
                    return temp;
                } else {
                    TreeNode temp = root.right;
                    return temp;
                }
            } else {
                TreeNode temp = root.right;
                while(temp.left != null) {
                    temp = temp.left;
                }
                root.val = temp.val;
                root.right = deleteNode(root.right, temp.val);
            }

        }
        return root;
    }
}