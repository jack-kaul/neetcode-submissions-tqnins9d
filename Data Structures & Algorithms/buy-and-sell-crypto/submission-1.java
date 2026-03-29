class Solution {
    public int maxProfit(int[] prices) {
        int min = 101, maxDiff = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }
            if(prices[i] - min > maxDiff) {
                maxDiff = prices[i] - min;
            }
        }
        return maxDiff;
    }
}
