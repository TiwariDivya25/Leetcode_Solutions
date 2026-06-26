class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans = 0;
        for(int num : nums) {
            ans += count(num, digit);
        }
        return ans;
    }
    private int count(int num, int d) {
        int count = 0;
        while(num != 0) {
            int last = num % 10;
            if(last == d) count++;
            num = num/10;
        }
        return count;
    }
}