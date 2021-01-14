package com.shuzu.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: JavaWorkSpace2->RectangleNumber
 * @description: 矩形的数量内容
 * @author: MaYuan
 * @create: 2020-02-11 15:58
 * @version: 1.0
 **/

public class RectangleNumber {
    public static int countCornerRectangles(int[][] grid) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int l = 0; l < grid[0].length; l++) {
                if (grid[i][l] == 0) {
                    continue;
                }
                for (int r = l + 1; r < grid[0].length; r++) {
                    if (grid[i][r] == 0) {
                        continue;
                    }
                    if (map.containsKey(l) && map.get(l).containsKey(r)) {
                        ans += map.get(l).get(r);
                    }
                    map.putIfAbsent(l, new HashMap<Integer, Integer>());
                    map.get(l).put(r, map.get(l).getOrDefault(r, 0) + 1);
                }
            }
        }
        return ans;
    }

    /**
     * 方法2
     *
     * @param args
     */

    public static int countCornerRectangles2(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int ans = 0;
        for (int u = 0; u < grid.length; u++) {
            for (int d = u + 1; d < grid.length; d++) {
                int cnt = 0;
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[u][j] == 1 && grid[d][j] == 1) {
                        cnt++;
                    }
                }
                ans += cnt * (cnt - 1) / 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int num = countCornerRectangles2(nums);
        System.out.println(num);
    }
}
