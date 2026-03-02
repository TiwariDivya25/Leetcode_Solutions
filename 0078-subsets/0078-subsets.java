class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        sets(nums, 0, ans, new ArrayList<>());
        return ans;
    }
    public void sets(int[] nums, int idx, List<List<Integer>> ans, List<Integer> set) {
        ans.add(new ArrayList<>(set));
        for(int i = idx; i < nums.length; i++) {
            set.add(nums[i]);
            sets(nums, i+1, ans, set);
            set.remove(set.size() - 1);
        }
        
    }
}