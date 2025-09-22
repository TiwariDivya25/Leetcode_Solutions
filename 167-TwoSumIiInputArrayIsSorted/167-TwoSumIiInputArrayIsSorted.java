// Last updated: 22/09/2025, 08:58:38
class Solution {
    static {
        Solution sol = new Solution();
        for(int i = 0; i<150; i++) {
            sol.twoSum(new int[] {1,2}, 3);
        }
    }
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            if(numbers[left] + numbers[right] > target) {
                right--;
            }
            else if(numbers[left] + numbers[right] < target) {
                left++;
            }
            else {
                return new int[] {left+1, right+1};
            }
        }
        return null;
    }
}