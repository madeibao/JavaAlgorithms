package com.matrix.www;

/**
 * @ClassName TransposeMatrix3
 * @Author：Mayuan
 * @Date 2020/11/2 17:01
 * @Description TODO
 * @Version 1.0
 * <p>
 * 实现矩阵的旋转操作。
 * <p>
 * 这里是一个兑换的算法。
 * 第一行和最后的一行来进行兑换
 * 然后矩阵转置既可以。
 **/
public class TransposeMatrix3 {

    public static int[][] transformImage(int[][] mat, int n) {

        for (int i = 0; i != n / 2; ++i) {
            for (int j = 0; j != n; ++j) {
                int temp = mat[i][j];
                mat[i][j] = mat[n - 1 - i][j];
                mat[n - 1 - i][j] = temp;
            }
        }

        for (int i = 0; i != n; ++i) {
            for (int j = 0; j != i; ++j) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] data = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = 3;
        int[][] res = transformImage(data, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
