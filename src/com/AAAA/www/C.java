package com.AAAA.www;

/**
 * @program: Pro1->C
 * @description: 基本测试文件
 * @author: MaYuan
 * @create: 2019-12-24 19:18
 * @version: 1.0
 **/

public class C {
    static int getPath(int m, int n) {
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            matrix[i][0] = 1;
        }

        for (int j = 0; j < n; j++) {
            matrix[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                matrix[i][j] = matrix[i][j - 1] + matrix[i - 1][j];
            }
        }
        return matrix[m - 1][n - 1];
    }

    public static void main(String[] args) {

        int m = 7, n =3;
        System.out.println(getPath(m,n));
    }

}