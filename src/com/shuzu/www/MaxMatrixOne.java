package com.shuzu.www;

/**
 * @ClassName MaxMatrixOne
 * @Author：Mayuan
 * @Date 2020/5/25 19:13
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个矩阵中的包含有最大的1的数量的矩阵
 **/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MaxMatrixOne {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = bufferedReader.readLine().split(" ");
        int n = Integer.valueOf(numbers[0]);
        int m = Integer.valueOf(numbers[1]);
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            numbers = bufferedReader.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(numbers[j]);
            }
        }

        System.out.println(getMaxArea(map));
    }

    /**
     * 根据一维数组得最大矩形,单调栈方法，找左右离它最近且比它小的位置
     */
    public static int maxRecSize(int[] height) {
        if (height == null || height.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] >= height[i]) {
                int index = stack.pop();
                int left = -1;
                if (!stack.isEmpty()) {
                    left = stack.peek();
                }
                int area = height[index] * (i - left - 1);
                max = Math.max(max, area);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int index = stack.pop();
            int left = -1;
            if (!stack.isEmpty()) {
                left = stack.peek();
            }
            int area = height[index] * (height.length - left - 1);
            max = Math.max(max, area);
        }
        return max;
    }

    /**
     * 根据二维数组得一维数组
     */

    public static int getMaxArea(int[][] arr) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) return 0;
        //首先得到height数值
        int n = arr.length;
        int m = arr[0].length;
        int[] height = new int[m];
        //第0行，初始化
        for (int j = 0; j < m; j++) {
            if (arr[0][j] == 0) {
                height[j] = 0;
            } else {
                height[j] = 1;
            }
        }
        int maxArea = maxRecSize(height);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) height[j]++;
                else height[j] = 0;
            }
            maxArea = Math.max(maxRecSize(height), maxArea);
        }
        return maxArea;
    }
}