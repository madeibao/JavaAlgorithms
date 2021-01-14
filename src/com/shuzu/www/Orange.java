package com.shuzu.www;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName Orange
 * @Author：Mayuan
 * @Date 2020/4/4 10:36
 * @Description TODO
 * @Version 1.0
 * <p>
 * 橘子的腐烂的问题
 * 句子从上下左右的四个方向来腐烂，求最少的腐烂完的时间。
 **/
public class Orange {

    public int orangesRotting(int[][] grid) {
        int h = grid.length, w = grid[0].length, time = 0;
        int[][] D = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        // 首先构建一个队列的内容
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j, time});
                }
            }
        }
        while (q.size() != 0) {
            int[] tmp = q.poll();
            time = tmp[2];
            for (int[] d : D) {
                int x = tmp[0] + d[0];
                int y = tmp[1] + d[1];
                if (x >= 0 && x < h && y >= 0 && y < w && grid[x][y] == 1) {
                    grid[x][y] = 2;
                    q.offer(new int[]{x, y, time + 1});
                }
            }
        }
        for (int[] l : grid) {
            for (int n : l) {
                if (n == 1) {
                    return -1;
                }
            }
        }
        return time;
    }

    public static void main(String[] args) {
        int[][] nums = {{2, 1, 1}, {1, 1, 0,}, {0, 1, 1},};
        System.out.println(new Orange().orangesRotting(nums));
    }
}
