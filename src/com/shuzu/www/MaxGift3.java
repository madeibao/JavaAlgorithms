package com.shuzu.www;

/**
 * @ClassName MaxGift3
 * @Author：Mayuan
 * @Date 2020/12/26/0026 20:23
 * @Description TODO
 * @Version 1.0
 *
 * 从左上角到右下角的获得的礼物的最大值。
 **/

public class MaxGift3 {

    public static int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp =new int[m+1][n+1];
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                dp[i][j] = grid[i-1][j-1]+Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }


    public static void main(String[] args) {
        int[][] res = new int[][]{{1, 3, 1},{1, 5, 1},{4, 2, 1}};
        System.out.println(maxValue(res));

    }
}
