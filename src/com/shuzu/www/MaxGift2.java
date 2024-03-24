package com.shuzu.www;

/**
 * @ClassName MaxGift2
 * @Author：Mayuan
 * @Date 2020/10/8 16:17
 * @Description TODO
 * @Version 1.0
 * <p>
 * 最大的礼物，从左上角到右下角的最大的礼物。
 **/
public class MaxGift2 {

    public static int maxValue(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        for (int i = 1; i < row; ++i) {
            grid[i][0] += grid[i - 1][0];
        }
        for (int j = 1; j < col; ++j) {
            grid[0][j] += grid[0][j - 1];
        }
        for (int i = 1; i < row; ++i) {
            for (int j = 1; j < col; ++j) {
                grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[row - 1][col - 1];
    }

    public static void main(String[] args) {
        int[][] res = new int[][]{{1, 3, 1},
                                  {1, 5, 1},
                                  {4, 2, 1}};
        System.out.println(maxValue(res));
    }
}
