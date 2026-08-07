class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, ans, used, new ArrayList<>());
        return ans;
    }
    private void backtrack(int[] nums, List<List<Integer>> ans,
                            boolean[] used, List<Integer> perm) {
        
        if(perm.size() == nums.length){
            ans.add(new ArrayList<>(perm));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(used[i]) continue;
            perm.add(nums[i]);
            used[i] = true;
            backtrack(nums, ans, used, perm);
            perm.remove(perm.size() - 1);
            used[i] = false;
        }
    }
}