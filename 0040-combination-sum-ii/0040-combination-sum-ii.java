class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        combination(candidates, target, ans, 0, new ArrayList<>());
        return ans;
    }
    private void combination(int[] candidates, int target, List<List<Integer>> ans, int idx, List<Integer> curr) {
        if(target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0 || idx == candidates.length) {
            return;
        }
        curr.add(candidates[idx]);
        combination(candidates, target - candidates[idx], ans, idx + 1, curr);
        curr.remove(curr.size() - 1);
        while(idx + 1 < candidates.length && candidates[idx] == candidates[idx + 1]) {
            idx++;
        }
        combination(candidates, target, ans, idx+1, curr);
        
    }
}