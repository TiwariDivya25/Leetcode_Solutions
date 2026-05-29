class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            nums[i] = dsum(nums[i]);
            if(nums[i] < min) min = nums[i];
        }
        return min;
    }
    private int dsum(int x) {
        int sum = 0;
        while(x != 0) {
            sum += x % 10;
            x = x/10;
        }
        return sum;
    }
}