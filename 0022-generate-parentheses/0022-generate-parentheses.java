class Solution {
    public List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        genarate(n, 0, 0, "");
        return ans;
    }
    private void genarate(int max, int open, int close, String up) {
        if(open == max && close == max) {
            ans.add(up);
            return;
        }
        if(open < max) {
            genarate(max, open+1, close, up+"(");
        }
        if(close < open) {
            genarate(max, open, close+1, up+")");
        }
    }
}