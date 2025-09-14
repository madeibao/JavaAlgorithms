package com.bag.www;

/**
 * @ClassName NumCanPartition
 * @Author：Mayuan
 * @Date 2025/9/14/星期日 20:42
 * @Version 1.0
 **/
public class NumCanPartition {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        boolean[][] dp = new boolean[len][target + 1];

        // 初始化配置
        for (int i = 0; i < len; i++) {
            dp[i][0] = true;
            if (nums[i] > target) {
                return false;
            }
            dp[i][nums[i]] = true;
        }

        for (int i = 1; i < len; i++) {
            for (int j = 1; j <= target; j++) {
                if (dp[i][target]) {
                    return true;
                }
                dp[i][j] = dp[i - 1][j];
                if (j - nums[i] >= 0) {  // 放置数组下标越界
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
                }
            }
        }
        return dp[len - 1][target];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 5, 11};
        System.out.println(new NumCanPartition().canPartition(nums));
    }
}