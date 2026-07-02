package com.dfs.www;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 给你一个有 n 个节点的 有向无环图（DAG），请你找出从节点 0 到节点 n-1 的所有路径并输出（不要求按特定顺序）
 *
 *  graph[i] 是一个从节点 i 可以访问的所有节点的列表（即从节点 i 到节点 graph[i][j]存在一条有向边）。
 *
 * @ClassName GraphAllPath
 * @Author Mayuan
 * @Date 2026/7/2/星期四 17:01
 * @Version 1.0
 **/
public class GraphAllPath {
    List<List<Integer>> ans = new ArrayList<>();
    // 当作一个队列来使用
    Deque<Integer> stack = new ArrayDeque<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        stack.offerLast(0);
        dfs(graph, 0, graph.length - 1);
        return ans;
    }

    public void dfs(int[][] graph, int x, int n) {
        if (x == n) {
            ans.add(new ArrayList<>(stack));
            return;
        }
        for (int y : graph[x]) {
            stack.offer(y);
            dfs(graph, y, n);
            stack.pollLast();
        }
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {3}, {3}, {}};
        List<List<Integer>> res = new GraphAllPath().allPathsSourceTarget(nums);
        for (var j : res) {
            for (var i : j) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
