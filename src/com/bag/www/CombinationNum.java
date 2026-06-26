package com.bag.www;

/**
 *
 * 组合数字
 *
 * @ClassName CombinationNum
 * @Author Mayuan
 * @Date 2026/6/26/星期五 18:54
 * @Version 1.0
 **/
public class CombinationNum {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int x : nums) {
                if (x <= i) {
                    dp[i] += dp[i - x];
                }
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 4;
        System.out.println(new CombinationNum().combinationSum4(nums, target));
    }
}
