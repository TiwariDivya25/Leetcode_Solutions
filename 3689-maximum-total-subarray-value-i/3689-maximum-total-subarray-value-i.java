class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];
        for(int n : nums) {
            if(n < min) min = n;
            if(n > max) max = n;
        }
        return (long)(max-min)*k;
    }
}