package com.matrix.www;

/**
 * @program: Pro1->TransposeMatrix2
 * @description: 矩阵的转置，行列互换
 * @author: MaYuan
 * @create: 2019-12-23 19:28
 * @version: 1.0
 **/
public class TransposeMatrix2 {
    public static int[][] transpose(int[][] A) {
        int[][] res = new int[A[0].length][A.length];
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                res[i][j] = A[j][i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] data = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] data2 = transpose(data);
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                System.out.print(data2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
