class Solution {
    public int subarraySum(int[] nums, int k) {
       int cnt = 0;
       int pre = 0;
       HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for(int i = 0; i < nums.length; i++) {
            pre += nums[i];
            cnt += hm.getOrDefault(pre - k, 0);
            hm.put(pre, hm.getOrDefault(pre, 0) + 1);
        }
        return cnt;
    }
}