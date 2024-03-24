package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->ClimStairs2
 * @description: 另一个爬楼梯
 * @author: MaYuan
 * @create: 2020-01-23 23:13
 * @version: 1.0
 **/
public class ClimStairs2 {
    public static int minCostClimbingStairs(int[] cost) {
        //我是这样理解的,感觉比较好理解
        //dp数组的每一个元素表示到达当前楼层所需的最小花费
        //也就是dp的第i个值是不包含cost[i]的，因为还没从第i层走出去，没消耗体力
        //dp的长度=cost+1，dp的最后一个元素就是到达楼顶所需的最小花费
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        //因为最开始可以选择起点，而选择起点是不消耗体力的
        dp[1] = 0;
        for (int i = 2; i < dp.length; i++) {
            //要么从第i-2层走到第i层，从要么第i-1层走到第i层
            dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {10, 15, 20};
        System.out.println(minCostClimbingStairs(nums));

    }
}
