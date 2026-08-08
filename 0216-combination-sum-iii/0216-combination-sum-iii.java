class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        combination(1, k, n, ans, new ArrayList<>());
        return ans;
    }
    private void combination(int num, int k, int n, List<List<Integer>> ans, List<Integer> list) {
        if(n == 0 && list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(list.size() == k || num > 9) return;
        list.add(num);
        combination(num+1, k, n - num, ans, list);
        list.remove(list.size() - 1);
        combination(num+1, k, n, ans, list);
    }
}