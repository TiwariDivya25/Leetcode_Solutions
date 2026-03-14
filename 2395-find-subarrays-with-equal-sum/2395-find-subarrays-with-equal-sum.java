class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length - 1; i++) {
            if(hs.contains(nums[i] + nums[i+1])) return true;
            hs.add(nums[i] + nums[i+1]);
        }
        return false;
    }
}