package com.dprogram.www;

import java.util.Arrays;

/**
 * @program: Pro1->ArrayPath
 * @description: 一个矩阵的路径的问题
 * @author: MaYuan
 * @create: 2019-12-24 18:05
 * @version: 1.0
 * leetcode62
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 问总共有多少条不同的路径？
 * * * *
 * * * *
 * * * *
 **/
public class ArrayPath {

    // 下面使用动态规划的方法内容

    private static int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        dp[1][1] = 1;
        //第一行
        for (int j = 2; j <= n; j++) {
            dp[1][j] = dp[1][j - 1];
        }

        // 第一列的内容的变化情况。
        for (int i = 2; i <= m; i++) {
            dp[i][1] = dp[i - 1][1];
        }

        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        return dp[m][n];
    }

    /**
     * 下面用递归的写法来实现。
     */
    private static int uniquePaths2(int m, int n) {
        return rec(m, n, m, n);
    }

    private static int rec(int m, int n, int i, int j) {
        if (i == 1 && j == 1) {
            return 1;
        }
        if (i == 1) {
            return rec(m, n, i, j - 1);
        }
        if (j == 1) {
            return rec(m, n, i - 1, j);
        }
        return rec(m, n, i - 1, j) + rec(m, n, i, j - 1);
    }

    public static int uniquePaths4(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths4(3, 3));
    }
}













