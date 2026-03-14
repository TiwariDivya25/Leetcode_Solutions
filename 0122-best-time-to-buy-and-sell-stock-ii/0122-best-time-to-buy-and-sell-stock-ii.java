class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int suff = prices[prices.length - 1];
        for(int i = prices.length - 2; i >= 0; i--){
            if(prices[i] < suff) {
                profit += suff - prices[i];
                suff = prices[i];
            }
            suff = Math.max(suff, prices[i]);
        }
        return profit;
    }
}