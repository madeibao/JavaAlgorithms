package com.shuzu.www;

import java.util.Scanner;

/**
 * @ClassName AppleDay
 * @Author：Mayuan
 * @Date 2020/4/13 18:00
 * @Description TODO
 * @Version 1.0
 * <p>
 * 矩阵上摘取最多的平安果
 * <p>
 * 4 4
 * <p>
 * 1 2 4 8
 * <p>
 * 10 14 3 9
 * <p>
 * 17 6 7 20
 * <p>
 * 12 5 21 23
 * 89
 * 沿着路径的内容来摘取平安果总和，最大的摘取数量。
 **/

public class AppleDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(), n = in.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                array[i][j] = in.nextInt();


        in.close();
        int[] dp = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            dp[i] = i == 0 ? array[0][i] : dp[i - 1] + array[0][i];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    dp[j] += array[i][0];
                } else {
                    dp[j] = Math.max(dp[j - 1], dp[j]) + array[i][j];
                }
                if (dp[j] > max) {
                    max = dp[j];
                }
            }
        }
        System.out.println(max);
    }
}




