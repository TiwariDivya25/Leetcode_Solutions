class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, nums, ans, new ArrayList<>());
        return ans;
    }
    public void backtrack(int idx, int[] nums, List<List<Integer>> ans, List<Integer> path){
        ans.add(new ArrayList<>(path));
        for(int i = idx; i<nums.length; i++){
            if(i > idx && nums[i] == nums[i-1]){
                continue;
            }
            path.add(nums[i]);
            backtrack(i+1, nums, ans, path);
            path.remove(path.size()-1);
        }
        
    }
}