package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->StockPrice
 * @description: 股票的销售最佳时间
 * @author: MaYuan
 * @create: 2020-02-05 21:23
 * @sversion: 1.0
 * 动态规划的方法来解决问题
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * <p>
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [7,1,5,3,6,4]
 * 输出: 7
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 *      随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 ***/
public class StockPrice {

    public static int maxProfit(int[] prices) {
        int n = prices.length;

        // 动态规划的内容，保存的是临时的结果值。
        int dp = 0;
        int max = 0;
        for (int i = 1; i < n; i++) {
            int num = prices[i] - prices[i - 1];
            dp = Math.max(dp + num, num);
            max = Math.max(dp, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 4, 6};
        System.out.println(maxProfit(nums));
    }
}
