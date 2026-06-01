class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length == 1) return cost[0];
        Arrays.sort(cost);
        int price = 0;
        int i = cost.length-1;
        while(i >= 0) {
            price += cost[i--];
            if (i >= 0) price += cost[i--];
            i--;
        }
        return price;
    }
}