// Last updated: 14/07/2026, 14:15:10
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        

        int[] profit = new int[n];
        int maxPrice = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            profit[i] = Math.max(profit[i + 1], maxPrice - prices[i]);
        }
        int res = 0;
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]); 
            res = Math.max(res, profit[i] + (prices[i] - minPrice)); 
        }

        return res;
    }
}
