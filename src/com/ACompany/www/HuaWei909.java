package com.ACompany.www;

import java.util.Scanner;

/**
 * @ClassName HuaWe909
 * @Author：Mayuan
 * @Date 2020/9/10 10:33
 * @Description TODO
 * @Version 1.0
 * <p>
 * 华为2020.9.09笔试题目解析
 * <p>
 * 2 3
 * 8 5 1
 * 7 6 2
 **/
public class HuaWei909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int temp = track(map, i, j, Integer.MAX_VALUE, 0);
                if (temp > result) {
                    result = temp;
                }
            }
        }
        System.out.println(result);
    }

    public static int track(int[][] map, int x, int y, int ori, int result) {
        if (x < 0 || x >= map.length || y < 0 || y >= map[0].length) {
            return result;
        }
        if (map[x][y] >= ori) {
            return result;
        }
        result++;
        return Math.max(Math.max(track(map, x - 1, y, map[x][y], result), track(map, x + 1, y, map[x][y], result)), Math.max(track(map, x, y - 1, map[x][y], result), track(map, x, y + 1, map[x][y], result)));
    }
}