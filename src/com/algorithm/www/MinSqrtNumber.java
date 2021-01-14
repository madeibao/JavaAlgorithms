package com.algorithm.www;

/**
 * @ClassName MinSqrt
 * @Author：Mayuan
 * @Date 2020/6/12 20:01
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 最少的完全平方的个数。
 **/
public class MinSqrtNumber {
    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int minV = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                minV = Math.min(dp[i - j * j], minV);
            }
            dp[i] = minV + 1;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numSquares(14));
    }
}
