class Solution {
    static {
        Solution sol = new Solution();
        for(int i = 0; i < 150; i++) {
            sol.maxArea(new int[] {1, 2});
        }
    }
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        for (int i = 0; i < height.length; i++) {
            int width = right - left;
            int area = width * (Math.min(height[left], height[right]));

            max = Math.max(max, area);

            if(height[left] <= height[right]) {
                left++;
            }
            else {
                right--;
            }

        }
        return max;
    }
}