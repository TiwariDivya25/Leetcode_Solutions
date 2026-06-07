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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int[] des : descriptions) {
            set.add(des[1]);
            if(!map.containsKey(des[0])){
                map.put(des[0], new TreeNode(des[0]));
            }
            if(!map.containsKey(des[1])) {
                map.put(des[1], new TreeNode(des[1]));
            }
            if(des[2] == 1) map.get(des[0]).left = map.get(des[1]);
            else map.get(des[0]).right = map.get(des[1]);
        }
        for(int[] des : descriptions) {
            if(!set.contains(des[0])) return map.get(des[0]);
        }
        return null;
    }
}