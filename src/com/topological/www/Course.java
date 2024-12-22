package com.topological.www;

import java.util.*;

/**
 * 课程表，拓扑排序
 *
 * @ClassName Course
 * @Author：Mayuan
 * @Date 2024/12/22/星期日 21:51
 * @Description 拓扑排序课程表
 * @Version 1.0
 **/
public class Course {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // int[]{1,0} 学课程1必须先学习课程 0
        int[] indegrees = new int[numCourses];

        // 每个点对应的边
        Map<Integer, List<Integer>> adjacency = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            adjacency.put(i, new ArrayList<>());
        }

        for (int[] cp : prerequisites) {
            adjacency.get(cp[1]).add(cp[0]);
            indegrees[cp[0]]++;
        }

        // 将度为0的加入到队列中
        for (int i = 0; i < numCourses; i++) {
            if (indegrees[i] == 0) {
                queue.add(i);
            }
        }

        while(!queue.isEmpty()){
            int pre = queue.poll();
            numCourses--;
            for(int cur : adjacency.get(pre)){
                if(--indegrees[cur] == 0){
                    queue.offer(cur);
                }
            }
        }
        return numCourses == 0;
    }

    public static void main(String[] args) {
        int numCourses = 2;
        int[][] adjacency = {{1,0}};
        System.out.println(new Course().canFinish(numCourses, adjacency));
    }
}
