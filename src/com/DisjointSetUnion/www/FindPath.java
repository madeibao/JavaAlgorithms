package com.DisjointSetUnion.www;

/**
 * 判断图中是否存在路径
 *
 * @ClassName FindPath
 * @Author：Mayuan
 * @Date 2024/11/16/星期六 21:32
 * @Description TODO
 * @Version 1.0
 **/
public class FindPath {
    private int cities;
    private int[] p;

    public int findCircleNum(int[][] isConnected) {
        cities = isConnected.length;
        p = new int[cities];

        for (int i = 0; i < cities; i++) {
            p[i] = i;
        }

        for (int i = 0; i < cities; i++) {
            for (int j = i + 1; j < cities; j++) {
                if (isConnected[i][j] == 1) {
                    union(i, j);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < cities; i++) {
            if (p[i] == i) {
                res++;
            }
        }
        return res;
    }

    public void union(int x, int y) {
        p[find(x)] = find(y);
    }

    int find(int x) {
        if (p[x] != x) {
            p[x] = find(p[x]);
        }
        return p[x];
    }

    public static void main(String[] args) {

        int[][] nums = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        FindPath findPath = new FindPath();
        System.out.println(findPath.findCircleNum(nums));
    }
}