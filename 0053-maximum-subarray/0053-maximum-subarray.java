class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for(int num : nums) {
            sum += num;
            ans = Math.max(ans, sum);
            if(sum < 0) sum = 0;
        }
        return ans;
    }
}