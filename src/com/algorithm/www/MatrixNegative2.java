package com.algorithm.www;

/**
 * @ClassName MatrixNegative2
 * @Author：Mayuan
 * @Date 2020/2/20 17:40
 * @Description TODO
 * @Version 1.0
 * 矩阵的负数内容。
 * 一个矩阵中的每一行的内容都是按照递减的内容来进行排列，
 * 然后求矩阵中的负数的内容。
 **/
public class MatrixNegative2 {
    public static int countNegatives(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int row = 0, col = n - 1, res = 0;
        while (row < m && col >= 0) {
            if (grid[row][col] < 0) {
                res += m - row;
                col--;
            } else {
                row++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] nums = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        System.out.println(countNegatives(nums));
    }
}
