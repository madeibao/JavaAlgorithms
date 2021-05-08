package com.AAAA.www;

/**
 * @program: Pro1->C
 * @description: 基本测试文件
 * @author: MaYuan
 * @create: 2019-12-24 19:18
 * @version: 1.0
 **/

public class C {

    static int maxGift(int[][] res) {
        int m = res.length;
        int n = res[0].length;
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                dp[i][j] = res[i-1][j-1]+Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        return dp[m][n];
    }
    public static void main(String[] args) {
        int[][] res = new int[][]{{1, 3, 1},{1, 5, 1},{4, 2, 1}};
        System.out.println(maxGift(res));

    }
}


