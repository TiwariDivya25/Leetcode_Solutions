class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        if (n <= 1) return;
        k = k % n;
        for(int i = 0; i < n / 2; i++){
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }
        for(int i = 0; i < k / 2; i++){
            int temp = nums[i];
            nums[i] = nums[k - i - 1];
            nums[k - i - 1] = temp;
        }
        for(int i = 0; i < (n - k) / 2; i++){
            int temp = nums[k + i];
            nums[k + i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }
    }
}
