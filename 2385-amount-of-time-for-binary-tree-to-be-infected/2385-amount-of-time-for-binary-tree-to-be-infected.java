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
    public TreeNode getNode(TreeNode root, int node) {
        if(root == null) return null;
        if(root.val == node) return root;
        TreeNode left = getNode(root.left, node);
        TreeNode right = getNode(root.right, node);
        if(left == null) return right;
        else return left;
    }
    public void preorder(TreeNode root, Map<TreeNode, TreeNode> p) {
        if(root == null) return;
        if(root.left!=null) p.put(root.left, root);
        if(root.right!=null) p.put(root.right, root);
        preorder(root.left, p);
        preorder(root.right, p);
    }
    public int amountOfTime(TreeNode root, int start) {
        TreeNode node = getNode(root, start);
        Map<TreeNode, TreeNode> p = new HashMap<>();
        preorder(root, p);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        Map<TreeNode, Integer> v = new HashMap<>();
        v.put(node, 0);
        while(!q.isEmpty()) {
            TreeNode temp = q.poll();
            int level = v.get(temp);
            if(temp.left != null && !v.containsKey(temp.left)) {
                v.put(temp.left, level+1);
                q.add(temp.left);
            }
            if(temp.right != null && !v.containsKey(temp.right)) {
                v.put(temp.right, level+1);
                q.add(temp.right);
            }
            if(p.get(temp) != null && !v.containsKey(p.get(temp))) {
                v.put(p.get(temp), level+1);
                q.add(p.get(temp));
            }
        }
        int max = -1;
        for(int i : v.values()) {
            max = Math.max(max, i);
        }
        return max;
    }
}