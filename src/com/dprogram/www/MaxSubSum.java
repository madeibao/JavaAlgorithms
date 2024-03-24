package com.dprogram.www;

import java.util.Arrays;

/**
 * @ClassName MaxSubSum
 * @Author：Mayuan
 * @Date 2023/9/3/0003 20:46
 * @Description TODO
 * @Version 1.0
 **/
public class MaxSubSum {

    public static int maxSubArray(int[] nums) {

        int[] dp = new int[nums.length];
        Arrays.fill(dp,0);

        dp[0] = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(dp[i-1]>0) {
                dp[i] = dp[i-1]+nums[i];
            }
            else {
                dp[i] = nums[i];
            }
        }

        int res = 0;
        for(int i:dp) {
            res = Math.max(i,res);
        }

        return res;
    }
    public static void main(String[] args) {

        int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}