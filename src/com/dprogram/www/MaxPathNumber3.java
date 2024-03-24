package com.dprogram.www;

import java.util.Scanner;

/**
 * @program: Pro1->MaxPathNumber3
 * @description: 三角形的路径3
 * @author: MaYuan
 * @create: 2019-12-25 19:06
 * @version: 1.0
 * 动态规划的思想来实现。
 * 3
 * 1
 * 12 3
 * 12 3 4
 * 25
 * <p>
 **/

public class MaxPathNumber3 {
    public static void main(String[] args) {
        int[][] a = new int[510][510];
        int[][] f = new int[510][510];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        /**
         * 自底部向上逐渐的推导，得出最终的值。
         */
        for (int i = n; i >= 1; i--) {
            //从最后一排开始走，从下往上。
            for (int j = 1; j <= i; j++) {
                f[i][j] = Math.max(f[i + 1][j + 1], f[i + 1][j]) + a[i][j];
            }
        }

        System.out.println(f[1][1]);
    }
}
