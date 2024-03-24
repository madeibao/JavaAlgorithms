package com.algorithm.www;

/**
 * @ClassName CoinExchange
 * @Author：Mayuan
 * @Date 2020/3/29 17:40
 * @Description TODO
 * @Version 1.0
 * <p>
 * 硬币的兑换策略
 **/
public class CoinExchange {
    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int x = coin; x < amount + 1; ++x) {
                dp[x] += dp[x - coin];
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {

        int amount = 14;
        int[] coins = {1, 2, 5};
        System.out.println(change(amount, coins));
    }
}
