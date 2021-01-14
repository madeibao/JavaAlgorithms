package com.shuzu.www;

/**
 * @ClassName DifferentPath
 * @Author：Mayuan
 * @Date 2020/10/7 22:49
 * @Description TODO
 * @Version 1.0
 * <p>
 * 不同的路径，从左上角到右下角的不同的路径的结果值
 * 3 行 2列的数据如何从左上角到右下角的位置上。
 **/
public class DifferentPath {

    public static int diff(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        System.out.println(diff(m, n));
    }
}



