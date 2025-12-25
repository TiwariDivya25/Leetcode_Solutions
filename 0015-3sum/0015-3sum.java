class Solution {
    static {
        Solution sol = new Solution();
        for (int i = 0; i < 150; i ++) {
            sol.threeSum(new int[] {-1, 0, 1});
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n && nums[i] <= 0; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i + 1;
            int k = n - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                } else if (sum > 0){
                    k--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                    result.add(list);
                }
            }
        }
        return result;
    }
}