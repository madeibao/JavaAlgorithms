package com.shuzu.www;

/**
 * @program: JavaWorkSpace2->SelectNumber
 * @description: 在一个二维的数组中来进行查找
 * @author: MaYuan
 * @create: 2020-02-12 14:22
 * @version: 1.0
 **/
public class SelectNumber {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {

        // 数据的行。
        int rows = matrix.length;
        if (rows == 0) {
            return false;
        }

        // 数据的列
        int cols = matrix[0].length;
        if (cols == 0) {
            return false;
        }

        // 从左下角开始查找
        int x = rows - 1;
        int y = 0;

        while (x >= 0) {

            while (y < cols && matrix[x][y] < target) {
                y++;
            }

            if (y < cols && matrix[x][y] == target) {
                return true;
            }

            x--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
                {4, 5, 6, 7}};
        int target = 5;
        System.out.println(findNumberIn2DArray(nums, target));
    }
}
