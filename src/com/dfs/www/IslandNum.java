package com.dfs.www;

/**
 * 查看岛屿数量
 *
 * @ClassName IslandNum
 * @Author：Mayuan
 * @Date 2024/10/20/星期日 22:27
 * @Description TODO
 * @Version 1.0
 **/
public class IslandNum {

    public int numIslands(char[][] grid) {
        int numIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    getIslands(grid, i, j);
                    numIslands++;
                }
            }
        }
        return numIslands;
    }

    public void getIslands(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '2';
        getIslands(grid, i - 1, j);
        getIslands(grid, i + 1, j);
        getIslands(grid, i, j - 1);
        getIslands(grid, i, j + 1);
    }

    public static void main(String[] args) {

        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(new IslandNum().numIslands(grid));
    }
}
