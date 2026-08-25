class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
         for(int num : nums) {
            if(num == k * (count + 1)) {
                count++;
            }
         }
         return k * (count+1);
    }
}