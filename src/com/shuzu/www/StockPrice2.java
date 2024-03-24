package com.shuzu.www;

/**
 * @ClassName StockPrice2
 * @Author：Mayuan
 * @Date 2020/6/4 19:24
 * @Description TODO
 * @Version 1.0
 * <p>
 * 股票买卖的第二种
 * 最多买入和卖出2次
 **/
public class StockPrice2 {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int len = prices.length;
        // 初始化的前半部分最小买入价格
        int min = prices[0];
        // 初始化的后半部分最大卖出价格
        int max = prices[len - 1];

        // 前半部分的每天最大利润
        int maxPro1 = 0;
        // 后半部分的每天最大利润
        int maxPro2 = 0;

        // 前半部分的利润表
        int[] profit1 = new int[len];
        // 后半部分的利润表
        int[] profit2 = new int[len];

        for (int i = 0; i < len; i++) {

            // 1. 计算 从前往后 的利润
            if (prices[i] <= min) {
                min = prices[i];
            } else {
                maxPro1 = Math.max(maxPro1, prices[i] - min);
            }
            profit1[i] = maxPro1;


            //  2. 计算 从后往前 的利润
            if (prices[len - 1 - i] >= max) {
                max = prices[len - 1 - i];
            } else {
                maxPro2 = Math.max(maxPro2, max - prices[len - 1 - i]);
            }
            profit2[len - i - 1] = maxPro2;
        }

        // 3. 计算利润和，求最大值
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            res = Math.max(res, profit1[i] + profit2[i]);
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(nums));
    }
}
