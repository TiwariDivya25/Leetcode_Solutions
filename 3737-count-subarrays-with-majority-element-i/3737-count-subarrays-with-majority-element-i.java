class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans = 0;
        int targetCount = 0;
        for(int i = 0; i < nums.length; i++) {
            targetCount = 0;
            for(int j = i; j < nums.length; j++) {
                if(nums[j] == target) targetCount++;
                if(targetCount > (j-i+1)/2) ans++;
            }
        }
        return ans;
    }
}