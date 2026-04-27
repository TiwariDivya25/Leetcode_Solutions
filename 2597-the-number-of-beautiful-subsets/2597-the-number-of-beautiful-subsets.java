class Solution {
    public int count = 0;
    public int beautifulSubsets(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        decision(nums, k,0, map);
        return count-1;
    }
    public void decision(int[] nums, int k, int idx, HashMap<Integer, Integer> map) {
        if(idx == nums.length) {
            count++;
            return;
        }
        //dont take
        decision(nums, k, idx+1, map);
        //accept valid
        if (!map.containsKey(nums[idx] - k) && !map.containsKey(nums[idx] + k)) {
             map.put(nums[idx], map.getOrDefault(nums[idx], 0) + 1);
            decision(nums, k, idx+1, map);
            //backtrack
            map.put(nums[idx], map.get(nums[idx])-1);
            if(map.get(nums[idx]) == 0) {
                map.remove(nums[idx]);
            }
        }
    }
}