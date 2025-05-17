package com.topological.www;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 课程表顺序
 *
 * @ClassName Course2
 * @Author：Mayuan
 * @Date 2025/5/17/星期六 18:02
 * @Version 1.0
 **/
public class Course2 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) {
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<>();
        int[] degree = new int[numCourses];
        for (int[] pre : prerequisites) {
            degree[pre[0]]++;
        }

        // 将度为0课程放入队列中
        for (int i = 0; i < degree.length; i++) {
            if (degree[i] == 0) {
                deque.offer(i);
            }
        }
        int count = 0;
        int[] res = new int[numCourses];
        while (!deque.isEmpty()) {
            int curr = deque.pollFirst();
            res[count++] = curr;
            for (int[] pre : prerequisites) {
                if (pre[1] == curr) {
                    degree[pre[0]]--;
                    if (degree[pre[0]] == 0) {
                        deque.offer(pre[0]);
                    }
                }
            }
        }
        if (count == numCourses) {
            return res;
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        Course2 course = new Course2();
        int[] result = course.findOrder(numCourses, prerequisites);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}
