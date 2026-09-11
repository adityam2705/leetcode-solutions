class Solution {
    public int maxProfit(int[] prices) {
        
        int totalProfit = 0;
        
        // Buy low, sell high whenever possible
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }
        
        return totalProfit; }
    
}