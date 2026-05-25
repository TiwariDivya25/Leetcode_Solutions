class Solution {
    public int[] concatWithReverse(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len * 2];
        int left = 0, right = (len*2)-1;
        while(left < right) {
            ans[left] = nums[left];
            ans[right] = nums[left];
            left++;
            right--;
        }
        return ans;
    }
}