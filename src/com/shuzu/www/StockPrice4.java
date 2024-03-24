package com.shuzu.www;

/**
 * @ClassName StockPrice4
 * @Author：Mayuan
 * @Date 2020/6/4 19:42
 * @Description TODO
 * @Version 1.0
 * <p>
 * 两次的股票买卖的最大利润
 **/
public class StockPrice4 {

    public static int maxProfit(int[] prices) {

        int minPrice1 = Integer.MAX_VALUE;
        int maxProfit1 = 0;
        int maxProfitAfterBuy = Integer.MIN_VALUE;
        int maxProfit2 = 0;
        for (int price : prices) {
            // 1.第一次最小购买价格
            minPrice1 = Math.min(minPrice1, price);

            // 2.第一次卖出的最大利润
            maxProfit1 = Math.max(maxProfit1, price - minPrice1);

            // 3.第二次购买后的剩余净利润
            maxProfitAfterBuy = Math.max(maxProfitAfterBuy, maxProfit1 - price);

            // 4.第二次卖出后，总共获得的最大利润（第3步的净利润 + 第4步卖出的股票钱）
            maxProfit2 = Math.max(maxProfit2, price + maxProfitAfterBuy);
        }
        return maxProfit2;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(maxProfit(nums));

    }
}
