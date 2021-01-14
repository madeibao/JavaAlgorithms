package com.shuzu.www;

import java.util.Arrays;

/**
 * @ClassName MinCoin
 * @Author：Mayuan
 * @Date 2020/10/25 16:13
 * @Description TODO
 * @Version 1.0
 * <p>
 * 最少找零钱算法
 **/
public class MinCoin {
    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int money = 14;
        System.out.println(coinChange(coins, money));
    }
}
