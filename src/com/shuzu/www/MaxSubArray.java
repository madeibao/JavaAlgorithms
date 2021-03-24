package com.shuzu.www;

/**
 * @ClassName MaxSubArray
 * @Author：Mayuan
 * @Date 2020/10/24 21:38
 * @Description TODO
 * @Version 1.0
 * 最大的子序列的和。
 **/
public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }

        int[] dp = new int[len];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < len; i++) {
            dp[i] = (dp[i - 1] + nums[i] > nums[i]) ? dp[i - 1] + nums[i] : nums[i];
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}
