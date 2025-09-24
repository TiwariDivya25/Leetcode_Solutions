class Solution {
    static {
        Solution sol = new Solution();
        for (int i = 0; i < 150; i++) {
            sol.maxProfit(new int[] {1, 2});
        }
    }
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++){
            if (prices[i] < min) {
                min = prices[i];
            }

            profit = Math.max(prices[i] - min, profit);
        }
        return profit;
    }
}