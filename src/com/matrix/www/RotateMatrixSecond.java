package com.matrix.www;

/**
 *
 * 矩阵的转置
 *
 * @ClassName RotateMatrixSecond
 * @Author：Mayuan
 * @Date 2025/5/11/星期日 18:34
 * @Version 1.0
 **/
public class RotateMatrixSecond {
    public static int[][] rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] res = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[j][m - i - 1] = matrix[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2,}, {3, 4}};
        int[][] nums2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] res = rotate(nums2);
        for (int[] num : res) {
            for (int j : num) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
