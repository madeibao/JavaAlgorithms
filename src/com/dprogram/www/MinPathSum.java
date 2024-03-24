package com.dprogram.www;

/**
 * @ClassName MinPathSum
 * @Author：Mayuan
 * @Date 2020/3/10 16:41
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个矩阵中，从左上角
 * 到右下角的路径的总和
 * 注意的是这里的是 m==n 的这种情况。
 * [[1,3,1],
 * [1,5,1],
 * [4,2,1]]
 * Given the above grid map, return 7. Because the path 1→3→1→1→1 minimizes the sum.
 **/
public class MinPathSum {

    public static int minPathSum(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length, n = grid[0].length;

        // m 代表行 n 代表列。
        int[] dp = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    // 只能从上侧走到该位置
                    dp[j] = dp[j];
                } else if (i == 0) {
                    // 只能从左侧走到该位置
                    dp[j] = dp[j - 1];
                }
                else {
                    dp[j] = Math.min(dp[j - 1], dp[j]);
                }
                dp[j] += grid[i][j];
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(minPathSum(nums));
    }
}
