
package com.bag.www;

public class NumCanPartition2 { 
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        // 如果是奇数，则无法平分
        if ((sum & 1) == 1) {
            return false;
        }
        // 目标和， 采用移位运算， 避免使用除法
        int target = sum >> 1;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[target];
    }

    public static void main(String[] args) { 
        int[] nums = {1,5,11,5};
        System.out.println(new NumCanPartition2().canPartition(nums));
    }
}