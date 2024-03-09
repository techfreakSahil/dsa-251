package Arrays.BestTimeToBuyAndSellStck;

public class Solution {
    public int maxProfit(int[] prices) {
        int cur_sum = 0;
        int max_sum = 0;
        for (int i = 1; i < prices.length; i++) {
            cur_sum = Math.max(0, cur_sum += prices[i] - prices[i - 1]);
            max_sum = Math.max(cur_sum, max_sum);
        }
        return max_sum;
    }
}
