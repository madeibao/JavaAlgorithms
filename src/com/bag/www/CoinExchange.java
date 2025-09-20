package com.bag.www;

import java.util.Arrays;

/**
 * 硬币兑换策略，最少的兑换数量
 *
 * @ClassName CoinExchange
 * @Author：Mayuan
 * @Date 2025/9/20/星期六 16:34
 * @Version 1.0
 **/
public class CoinExchange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] != amount + 1) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        // 如果不能凑出，根据题意返回 -1
        if (dp[amount] == amount + 1) {
            dp[amount] = -1;
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50,100};
        CoinExchange coinExchange = new CoinExchange();
        System.out.println(coinExchange.coinChange(coins, 110));
    }
}
