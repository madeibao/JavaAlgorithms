package com.algorithm.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName SetApple
 * @Author：Mayuan
 * @Date 2020/4/8 22:16
 * @Description TODO
 * @Version 1.0
 * 防止苹果的算法
 * m 个苹果放置在 n个盘里面的方法。
 **/
public class SetApple {

    public static int fun2(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            dp[i][1] = 1;
        }
        for (int i = 1; i <= n; i++) {
            dp[1][i] = 1;
            dp[0][i] = 1;
        }

        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                if (i >= j) {
                    dp[i][j] = dp[i][j - 1] + dp[i - j][j];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[m][n];
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int a = Integer.valueOf(str.split(" ")[0]);
        int b = Integer.valueOf(str.split(" ")[1]);

        System.out.println(fun2(a, b));

    }
}
