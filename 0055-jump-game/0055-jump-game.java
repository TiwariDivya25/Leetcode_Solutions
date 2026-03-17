class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxI = 0;
        for(int i = 0; i < n; i++) {
            if(i > maxI) return false;
            maxI = Math.max(maxI, i+nums[i]);
        }
        return true;
    }
}