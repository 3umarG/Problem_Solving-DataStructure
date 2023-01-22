package blind75;

public class BestTimeToSellAndBuy {
    /*

    * You are given an array prices where prices[i] is the price of a given stock on the ith day.
    * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

     */
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }


   /*
   Complexity Analysis

   * Time complexity: O(n) Only a single pass is needed.
   * Space complexity: O(1) Only two variables are used.

    */
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int l = 0, r = 1;
        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                profit = Math.max(profit , prices[r]-prices[l]);
            } else {
                // Buy is greater than Sell
                // This is not acceptable
                // I will change the buy day to the sell day
                // because it is the minimum ...
                // and I will start from it .
                l = r;
            }
            r++;
        }
        return profit;
    }

}
