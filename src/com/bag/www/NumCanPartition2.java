
package com.bag.www;

public class NumCanPartition2 { 
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // 如果是奇数，则无法平分
        if ((sum & 1) == 1) {
            return false;
        }
        // 目标和， 采用移位运算， 避免使用除法
        int target = sum >> 1;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }
        return dp[target];
    }

    public static void main(String[] args) { 
        int[] nums = {1,5,11,5};
        System.out.println(new NumCanPartition2().canPartition(nums));
    }
}