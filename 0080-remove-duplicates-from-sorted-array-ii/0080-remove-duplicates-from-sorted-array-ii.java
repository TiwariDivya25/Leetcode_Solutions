class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for(int fast = 0; fast <nums.length; fast++) {
            if(slow < 2 || nums[fast] != nums[slow-2]) {
                nums[slow] = nums[fast];
                slow++;
            } 
        }
        return slow;
    }
}