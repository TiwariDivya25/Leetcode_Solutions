class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;

        int[] mx = new int[nums.length];
        int[] gcdValues = new int[nums.length];

        mx[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            mx[i] = Math.max(nums[i], mx[i-1]);
        }

        for(int i = 0; i < nums.length; i++) {
            gcdValues[i] = gcd(nums[i], mx[i]);
        }

        Arrays.sort(gcdValues);

        int left = 0;
        int right = n - 1;

        long ans = 0;

        while(left < right) {
            ans += gcd(gcdValues[left], gcdValues[right]);
            left++;
            right--;
        }

        return ans;
    }

    private int gcd(int x, int y) {
        if(y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}