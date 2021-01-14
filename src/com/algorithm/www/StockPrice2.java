package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->StockPrice2
 * @description: 股票买卖的最佳时机2
 * @author: MaYuan
 * @create: 2020-02-14 13:54
 * @version: 1.0
 **/
public class StockPrice2 {

    private static int maxProfit(int[] nums) {

        int res = 0, buy = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            buy = Math.min(buy, nums[i]);
            res = Math.max(res, nums[i] - buy);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        int temp = maxProfit(nums);
        System.out.println(temp);
    }
}
