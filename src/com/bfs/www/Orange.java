package com.bfs.www;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName Orange
 * @Author：Mayuan
 * @Date 2023/10/18/0018 9:55
 * @Description TODO
 * @Version 1.0
 **/
public class Orange {
    public int orangesRotting(int[][] grid) {
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};

        Queue<int[]> queue = new LinkedList<>();;

        int m = grid.length;
        int n = grid[0].length;

        int count = 0;

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j] ==1) {
                    count++;
                }
                else if(grid[i][j]==2) {
                    queue.add(new int[]{i,j});
                }
            }
        }

        // 表示经过几轮循环之后,橘子腐烂

        int round = 0;

        while (count>0&&!queue.isEmpty()) {

            round++;
            int N = queue.size();
            for(int i=0;i<N;i++) {
                int[] orange = queue.poll();
                int r = orange[0];
                int c = orange[1];
                if (r-1 >= 0 && grid[r-1][c] == 1) {
                    grid[r-1][c] = 2;
                    count--;
                    queue.add(new int[]{r-1, c});
                }
                if (r+1 < m && grid[r+1][c] == 1) {
                    grid[r+1][c] = 2;
                    count--;
                    queue.add(new int[]{r+1, c});
                }
                if (c-1 >= 0 && grid[r][c-1] == 1) {
                    grid[r][c-1] = 2;
                    count--;
                    queue.add(new int[]{r, c-1});
                }
                if (c+1 < n && grid[r][c+1] == 1) {
                    grid[r][c+1] = 2;
                    count--;
                    queue.add(new int[]{r, c+1});
                }
            }
        }

        if(count>0) {
            return -1;
        }
        else {
            return round;
        }
    }
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(new Orange().orangesRotting(grid));
    }
}
