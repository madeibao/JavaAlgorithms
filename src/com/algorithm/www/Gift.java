package com.algorithm.www;

/**
 * @ClassName Gift
 * @Author：Mayuan
 * @Date 2020/8/3 20:25
 * @Description TODO
 * @Version 1.0
 * //牛妹妹的礼物
 **/
public class Gift {
    public int selectPresent(int[][] presentVolumn) {
        // write code here

        if (presentVolumn.length == 0) {
            return 0;
        }
        // write code here
        int m = presentVolumn.length;
        int n = presentVolumn[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = presentVolumn[0][0];
        for (int i = 1; i < n; i++) {
            dp[0][i] = presentVolumn[0][i] + dp[0][i - 1];
        }

        for (int i = 1; i < m; i++) {
            dp[i][0] = presentVolumn[i][0] + dp[i - 1][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = presentVolumn[i][j] + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] res = new int[][]{{1, 2, 3}, {2, 3, 4}};
        System.out.println(new Gift().selectPresent(res));
    }
}
