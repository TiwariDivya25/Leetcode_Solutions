// Last updated: 22/09/2025, 08:58:33
class Solution {
    
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int pre = 1, post = 1;

        for(int i = 0; i < nums.length; i++) {
            result[i] = pre;
            pre = nums[i]*pre;
        }

        for(int i=nums.length-1; i >= 0 ; i--) {
            result[i] = result[i]*post;
            post =  post*nums[i];
        }

        return result;
    }
}