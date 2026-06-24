class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            int cnt = map.get(num);
            if(ans.size() < cnt) {
                ans.add(new ArrayList<>());
            }
            ans.get(cnt - 1).add(num);
        }
        return ans;
    }
}