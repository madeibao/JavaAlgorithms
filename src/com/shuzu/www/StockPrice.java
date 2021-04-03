package com.shuzu.www;

/**
 * @ClassName StockPrice
 * @Author：Mayuan
 * @Date 2020/6/4 19:19
 * @Description TODO
 * @Version 1.0
 * <p>
 * 股票的买卖
 * <p>
 * 尽可能多的买卖股票的信息
 * 可以多次的买卖股票。
 **/
public class StockPrice {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int tmp = prices[i] - prices[i - 1];
            if (tmp > 0) {
                profit += tmp;
            }
        }
        return profit;
    }

    private int maxProfit2(int[] prices) {
        int profit = 0;
        for(int i=1;i<prices.length;i++) {
            int temp = prices[i]-prices[i-1];
            if(temp>0) {
                profit+= temp;
            }
        }

        return profit;
    }
    public static void main(String[] args) {

        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println(new StockPrice().maxProfit(nums));
    }
}
