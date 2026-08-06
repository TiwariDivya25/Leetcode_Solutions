class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        sets(nums, 0, ans, new ArrayList<>());
        return ans;
    }

    public void sets(int[] nums, int idx, List<List<Integer>> ans, List<Integer> set) {
        if(idx == nums.length) {
            ans.add(new ArrayList<>(set));
            return;
        }
        set.add(nums[idx]);
        sets(nums, idx+1, ans, set);
        set.remove(set.size() - 1);
        sets(nums, idx+1, ans, set);
    }
}