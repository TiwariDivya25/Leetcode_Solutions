class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combination(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }
    public void combination(int[] candidates, int target, int idx, List<Integer> com, List<List<Integer>> ans) {
        if(target == 0){
            ans.add(new ArrayList<>(com));
            return;
        }
        if(target < 0 || idx == candidates.length){
            return;
        }
        com.add(candidates[idx]);
        combination(candidates, target-candidates[idx], idx, com, ans);
        com.remove(com.size() - 1);
        combination(candidates, target, idx+1, com, ans);
    }
}