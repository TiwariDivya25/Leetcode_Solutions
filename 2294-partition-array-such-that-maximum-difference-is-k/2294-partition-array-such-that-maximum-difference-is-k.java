class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i= 0; i < nums.length; i++) {
            int j = i+1;
            while(j < nums.length && nums[j] - nums[i] <= k) {
                j++;
            }
            ans++;
            i = j-1;
        }
        return ans;
    }
}