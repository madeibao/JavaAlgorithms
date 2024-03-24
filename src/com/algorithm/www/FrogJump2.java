package com.algorithm.www;

/**
 * @ClassName FrogJump2
 * @Author：Mayuan
 * @Date 2021/6/3/0003 16:01
 * @Description TODO
 * @Version 1.0
 *
 * 青蛙跳台阶
 *
 **/

public class FrogJump2 {

    static int numWays(int n) {
        if(n<=1) {
            return 1;
        }

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        for(int i=3;i<=n;i++) {
            dp[i] = (dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(numWays(5));

    }
}
