package com.algorithm.www;

/**
 * @ClassName MaxPofit
 * @Author：Mayuan
 * @Date 2021/1/4/0004 15:23
 * @Description TODO
 * @Version 1.0
 * 股票的最大的利润。
 **/


public class MaxProfit {

    private static int maxProfit(int[] nums) {

        int profit= Integer.MIN_VALUE;
        int temp = nums[0];
        for(int i=1;i<nums.length;i++) {
            profit = Math.max(profit, nums[i]-temp);
            temp = Math.min(temp,nums[i]);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}
