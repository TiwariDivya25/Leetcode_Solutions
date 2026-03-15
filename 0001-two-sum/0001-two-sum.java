class Solution {
    static {
        Solution sol = new Solution();
        for (int i = 0; i < 500; i++){
            sol.twoSum(new int[] {1, 2}, 3);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if(hm.containsKey(comp)){
                return new int[] {hm.get(comp), i};
            }
            hm.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}