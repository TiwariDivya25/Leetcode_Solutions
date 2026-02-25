class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        int temp = 0;
        for(int i = 0; i < accounts.length; i++) {
            for(int j = 0; j < accounts[i].length; j++) {
                temp+=accounts[i][j];
            }
            ans = Math.max(ans, temp);
            temp = 0;
        }
        return ans;
    }
}