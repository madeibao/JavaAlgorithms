package com.dprogram.www;

/**
 * @ClassName MinPathSum3
 * @Author：Mayuan
 * @Date 2020/3/21 9:58
 * @Description TODO
 * @Version 1.0
 * <p>
 * 矩阵的最小的路径内容

 * [
 * [1,3,1],
 * [1,5,1],
 * [4,2,1],
 * ]
 **/


public class MinPathSum3 {
    public static int minPathSum(int[][] grid) {
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if (i == grid.length - 1 && j != grid[0].length - 1) {
                    grid[i][j] = grid[i][j] + grid[i][j + 1];
                } else if (j == grid[0].length - 1 && i != grid.length - 1) {
                    grid[i][j] = grid[i][j] + grid[i + 1][j];
                } else if (j != grid[0].length - 1 && i != grid.length - 1) {
                    grid[i][j] = grid[i][j] + Math.min(grid[i + 1][j], grid[i][j + 1]);
                }
            }
        }
        return grid[0][0];
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(minPathSum(nums));
    }
}
