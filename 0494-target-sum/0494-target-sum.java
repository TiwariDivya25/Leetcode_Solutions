class Solution {
    public int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        targetSum(nums, target, 0, 0);
        return count;
    }
    public void targetSum(int[] nums, int target, int sum, int idx){
        if(idx == nums.length) {
            if(sum == target) count+=1;
            return;
        }
        targetSum(nums, target, sum+nums[idx], idx+1);
        targetSum(nums, target, sum-nums[idx], idx+1);
    }
}