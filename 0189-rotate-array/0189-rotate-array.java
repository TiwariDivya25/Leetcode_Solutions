class Solution {
    public void rotate(int[] nums, int k) {
        for(int i = 0; i < nums.length/2; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-i-1];
            nums[nums.length-i-1] = temp;
        }
        for(int i = 0; i < k/2; i++){
            int temp = nums[i];
            nums[i] = nums[k-i-1];
            nums[k-i-1] = temp;
        }
        for(int i = 0; i < (nums.length-k)/2; i++) {
            int temp = nums[k+i];
            nums[k+i] = nums[nums.length-i-1];
            nums[nums.length-i-1] = temp;
        } 
    }
}