package com.dprogram.www;

/**
 * @program: JavaWorkSpace2->UniquePath2
 * @description: 矩阵的路径的计算结果值
 * @author: MaYuan
 * @create: 2019-12-26 19:40
 * @version: 1.0
 **/
public class UniquePath2 {
    private static int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        dp[1][1] = 1;

        for (int i = 2; i <= m; i++) {
            dp[i][1] = dp[i - 1][1];
        }

        for (int j = 2; j <= n; j++) {
            dp[1][j] = dp[1][j - 1];
        }

        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(7, 3));
    }
}
