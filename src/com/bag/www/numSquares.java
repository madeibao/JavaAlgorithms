package com.bag.www;

import java.util.Arrays;

/**
 * 数字由多少个完全平方数来组成
 *
 * @ClassName numSquares
 * @Author：Mayuan
 * @Date 2025/9/14/星期日 20:28
 * @Version 1.0
 **/
public class numSquares {
    public static int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=0; i<=n; i++) {
            for(int j=1; j*j<=i; j++) {
                dp[i] = Math.min(dp[i], dp[i-j*j] + 1);
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int num = 13;
        System.out.println(numSquares(num));
    }
}


