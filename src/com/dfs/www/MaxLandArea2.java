package com.dfs.www;

/**
 *
 * @ClassName MaxLandArea2
 * @Author Mayuan
 * @Date 2026/7/2/星期四 12:18
 * @Version 1.0
 **/
public class MaxLandArea2 {
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // 发现陆地！
                if (grid[i][j] == 1) {
                    ans = Math.max(ans, dfs(grid, i, j));
                }
            }
        }
        return ans;
    }

    private int dfs(int[][] grid, int m, int n) {
        if (!(m >= 0 && m < grid.length && n >= 0 && n < grid[0].length)) {
            return 0;
        }
        // 这是海域或者是到达过的地方，不作数啦
        if (grid[m][n] == 0 || grid[m][n] == 2) {
            return 0;
        }
        grid[m][n] = 2;
        return 1 + dfs(grid, m + 1, n) +
                dfs(grid, m - 1, n) +
                dfs(grid, m, n + 1) +
                dfs(grid, m, n - 1);
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        System.out.println(new MaxLandArea2().maxAreaOfIsland(grid));
    }
}