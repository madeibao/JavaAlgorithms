package com.dfs.www;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @ClassName GraphAllPath2
 * @Author Mayuan
 * @Date 2026/7/2/星期四 18:03
 * @Version 1.0
 **/
public class GraphAllPath2 {

    int[][] graph;
    int n;
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        this.graph = graph;
        this.n = graph.length;
        path.add(0);
        backTrace(0);
        return res;
    }


    public void backTrace(int start) {
        if (start == n - 1) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int y : graph[start]) {
            path.add(y);
            backTrace(y);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {3}, {3}, {}};
        List<List<Integer>> res = new GraphAllPath2().allPathsSourceTarget(nums);
        for (var j : res) {
            for (var i : j) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
