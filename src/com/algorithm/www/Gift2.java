package com.algorithm.www;

/**
 * @ClassName Gift2
 * @Author：Mayuan
 * @Date 2020/8/3 20:27
 * @Description TODO
 * @Version 1.0
 **/
public class Gift2 {
    public static int getMost(int[][] board) {
        // write code here
        if (board == null || board[0].length == 0) {
            return 0;
        }
        int col = board.length;
        int row = board[0].length;
        int[][] dp = new int[row + 1][col + 1];
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + board[i - 1][j - 1];
            }
        }
        return dp[row][col];
    }

    public static void main(String[] args) {
        int[][] temp = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(getMost(temp));
    }
}
