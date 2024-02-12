public class BuyAndSellStocks {
    public static void main(String[] args) {
        // Buy & Sell Stocks

        // Q: You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

        int prices[] = {7, 1, 5, 3, 6, 4};

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        System.out.println("Max Profit: " + maxProfit);

        // Time Complexity: O(n), Space Complexity: O(1)
    }
}
