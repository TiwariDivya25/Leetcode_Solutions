class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }
        List<Integer> ans = new ArrayList();
        for(int i = min + 1; i < max; i++) {
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}