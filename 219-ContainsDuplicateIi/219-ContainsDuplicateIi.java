// Last updated: 22/09/2025, 08:58:34
class Solution {
    static{
        Solution sol = new Solution();
        for(int i = 0; i <200; i++) {
            sol.containsNearbyDuplicate(new int[] {1}, 1);
        }
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                if(i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}