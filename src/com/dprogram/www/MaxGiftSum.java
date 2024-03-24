package com.dprogram.www;

/**
 * @ClassName MaxGiftSum
 * @Author：Mayuan
 * @Date 2020/5/17 22:19
 * @Description TODO
 * @Version 1.0
 * <p>
 * 最大的礼物来求和
 **/
public class MaxGiftSum {
    public static int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    grid[i][j] += grid[i][j - 1];
                } else {
                    if (j == 0) {
                        grid[i][j] += grid[i - 1][j];
                    } else {
                        grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
                    }
                }
            }
        }
        return grid[m - 1][n - 1];
    }


    public static void main(String[] args) {
        int[][] nums = {{1, 3, 1},
                        {1, 5, 1},
                        {4, 2, 1}};
        System.out.println(maxValue(nums));
    }
}
