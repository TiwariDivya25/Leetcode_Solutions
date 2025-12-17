class Solution {
    public void sortColors(int[] nums) {
        int red = 0, white = 0, blue = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                red++;
            } else if (nums[i] == 1) {
                white++;
            } else {
                blue++;
            }
        }
        int idx = 0;
        for (int i = 0; i < red; i++) {
            nums[idx++] = 0;
        }
        for (int i = 0; i < white; i++) {
            nums[idx++] = 1;
        }
        for (int i = 0; i < blue; i++) {
            nums[idx++] = 2;
        } 

    }
}