package com.algorithm.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: JavaWorkSpace2->FindMinPath
 * @description: 寻找矩阵的路径内容的最小和
 * @author: MaYuan
 * @create: 2020-01-11 21:14
 * @version: 1.0
 * <p>
 * 4 4
 * 1 3 5 9
 * 8 1 3 4
 * 5 0 6 1
 * 8 8 4 0
 * <p>
 * 给定一个 n * m 的矩阵 a，从左上角开始每次只能向右或者向下走，最后到达右下角的位置，路径上所有的数字累加起来就是路径和，输出所有的路径中最小的路径和。
 * 输入描述:
 * 第一行输入两个整数 n 和 m，表示矩阵的大小。
 * <p>
 * 接下来 n 行每行 m 个整数表示矩阵。
 * 输出描述:
 * 输出一个整数表示答案。
 * 示例1
 **/
public class FindMinPath {
    public static int minPath(int[][] m) {
        // 代表的是矩阵的行。
        int row = m.length - 1;
        // 代表的是矩阵的列的内容。
        int col = m[0].length - 1;
        int[] dp = new int[col + 1];

        // 从后面向前面的内容来进行推导。
        dp[col] = m[row][col];

        for (int i = col - 1; i >= 0; i--) {
            dp[i] = dp[i + 1] + m[row][i];
        }
        for (int i = row - 1; i >= 0; i--) {
            dp[col] = dp[col] + m[i][col];
            for (int j = col - 1; j >= 0; j--) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + m[i][j];
            }
        }
        return dp[0];
    }

    /**
     * 下面采用的是动态规划的思想来进行。
     *
     * @param matrix
     * @return
     */
    public static int getMinPath2(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        // 构造的一个新的元素的序列内容。
        int[][] dp = new int[rows][cols];

        dp[0][0] = matrix[0][0];
        for (int i = 1; i < rows; i++) {
            dp[0][i] = dp[0][i - 1] + matrix[0][i];
        }
        for (int j = 1; j < cols; j++) {
            dp[j][0] = dp[j - 1][0] + matrix[j][0];
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + matrix[i][j];
            }
        }
        //printMatrix(dp);//for test
        return dp[rows - 1][cols - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 输入一个矩阵的内容。
        String[] strs = br.readLine().split(" ");
        int row = Integer.parseInt(strs[0]);
        int col = Integer.parseInt(strs[1]);
        int[][] m = new int[row][col];
        for (int i = 0; i < row; i++) {
            strs = br.readLine().split(" ");
            for (int j = 0; j < col; j++) {
                m[i][j] = Integer.parseInt(strs[j]);
            }
        }
        System.out.println(getMinPath2(m));
    }
}
