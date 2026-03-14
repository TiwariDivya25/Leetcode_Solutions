class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int suff = prices[prices.length - 1];
        for(int i = prices.length - 2; i >= 0; i--){
            profit = Math.max(profit, suff - prices[i]);
            if(prices[i] > suff) suff = prices[i];
        }        
        return profit;
    }
}