package com.shuzu.www;

/**
 * @ClassName ClimFloor
 * @Author：Mayuan
 * @Date 2020/5/27 21:37
 * @Description TODO
 * @Version 1.0
 * <p>
 * 爬楼梯的结果值。
 **/
public class ClimFloor {
    public static int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[3];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < len; i++) {
            dp[i % 3] = Math.min(dp[(i - 1) % 3], dp[(i - 2) % 3]) + cost[i];
        }
        return Math.min(dp[(len - 1) % 3], dp[(len - 2) % 3]);
    }

    public static void main(String[] args) {

        int[] nums = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(nums));
    }
}
