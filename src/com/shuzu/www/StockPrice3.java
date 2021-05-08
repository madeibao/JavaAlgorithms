package com.shuzu.www;

/**
 * @ClassName StockPrice3
 * @Author：Mayuan
 * @Date 2020/6/4 19:30
 * @Description TODO
 * @Version 1.0
 * <p>
 * 股票买卖3
 * 股票只能够买和卖一次的情况。
 * 交易一次的方法。
 **/
public class StockPrice3 {

    // 双重循环的方式，来实现
    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
    }

    private static int maxProfit2(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;
        }
        int maxProfit = Integer.MIN_VALUE;
        int cur = prices[0];
        for (int i = 0; i < prices.length; i++) {
            cur = Math.min(cur, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - cur);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit2(nums));
    }
}
