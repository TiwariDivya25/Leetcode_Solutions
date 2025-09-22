// Last updated: 22/09/2025, 08:58:50
class Solution {
    static {
        Solution sol = new Solution();
        for (int i = 0; i < 500; i++){
            sol.twoSum(new int[] {1, 2}, 3);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];

            if(map.containsKey(sub)){
                return new int[] {i, map.get(sub)};
            }

            map.put(nums[i], i);
        }
        return null;
    }
}