package com.dfs.www;

/**
 * 岛屿的最大面积
 *
 * @ClassName MaxLandArea
 * @Author Mayuan
 * @Date 2026/7/2/星期四 11:58
 * @Version 1.0
 **/
public class MaxLandArea {

    private static final int[][] DIRS = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}}; // 左右上下
    public int maxAreaOfIsland(int[][] grid) {

        int maxArea = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    maxArea = Math.max(maxArea, dfs(grid, i, j));
                }

            }
        }
        return maxArea;
    }

    public int dfs(int[][] grid, int i, int j) {
        int area = 1;
        grid[i][j] = 0;
        for (int[] dir : DIRS) {
            int x = i + dir[0];
            int y = j + dir[1];
            if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] > 0) {
                area += dfs(grid, x, y);
            }
        }
        return area;
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
        System.out.println(new MaxLandArea().maxAreaOfIsland(grid));
    }
}


