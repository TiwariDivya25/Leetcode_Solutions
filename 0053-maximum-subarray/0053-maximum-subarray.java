class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int pre = 0;
        for(int i = 0; i < nums.length; i++) {
            pre += nums[i];
            ans = Math.max(ans, pre);
            if(pre < 0) pre = 0; 
        }
        return ans;
    }
}