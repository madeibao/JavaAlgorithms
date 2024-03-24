package com.dprogram.www;

import java.util.Scanner;

/**
 * @program: Pro1->MaxPathNumber2
 * @description: 三角形路径的内容
 * @author: MaYuan
 * @create: 2019-12-25 18:40
 * @version: 1.0
 * <p>
 * * 3
 * * 1
 * * 12 3
 * * 12 3 4
 * <p>
 * 返回的是25， 1 + 12 + 12 = 25
 **/
public class MaxPathNumber2 {
    /**
     * 递归的写法
     * 采用递归的写法，矩阵不宜过于大， 否则会递归超时。
     *
     * @param args
     */
    private static int getSum(int[][] matrix, int n, int l, int r) {
        if (l == n - 1) {
            return matrix[l][r];
        } else {
            return Math.max(getSum(matrix, n, l + 1, r), getSum(matrix, n, l + 1, r + 1)) + matrix[l][r];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // 这里的假定是下标从0开始运行。
        System.out.println(getSum(matrix, n, 0, 0));
        sc.close();
    }
}
