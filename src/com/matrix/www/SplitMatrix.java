package com.matrix.www;

import java.util.Arrays;

/**
 * 分割矩阵是否存在相同值
 *
 * @ClassName SplitMatrix
 * @Author：Mayuan
 * @Date 2025/5/11/星期日 18:56
 * @Version 1.0
 **/
public class SplitMatrix {
    public boolean canPartitionGrid(int[][] grid) {
        long sum = 0;
        for (int[] row : grid) {
            sum += Arrays.stream(row).sum();
        }
        return splitA(grid, sum) || splitA(rotate(grid), sum);
    }

    public boolean splitA(int[][] grid, long target) {
        long res = 0;
        for (int[] row : grid) {
            res += Arrays.stream(row).sum();
            if (res * 2 == target) {
                return true;
            }
        }
        return false;
    }

    private int[][] rotate(int[][] a) {
        int m = a.length, n = a[0].length;
        int[][] b = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[j][m - 1 - i] = a[i][j];
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,4},{2,3}};
        System.out.println(new SplitMatrix().canPartitionGrid(nums));
    }
}
