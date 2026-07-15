class Solution {
    public int maxProfit(int[] prices) {

        int mp = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
            } else {
                int profit = prices[i] - min;
                if (profit > mp) {
                    mp = profit;
                }
            }
        }

        return mp;
    }
}