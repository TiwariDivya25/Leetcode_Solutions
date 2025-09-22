// Last updated: 22/09/2025, 08:58:36
class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for(int i = 0; i<nums.length; i++){
            if (nums[i]==0) {
                continue;
            }
            nums[k++]=nums[i];
        }
        for(int i = k; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}