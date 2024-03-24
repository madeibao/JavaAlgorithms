package com.shuzu.www;

/**
 * @ClassName FindMatrix
 * @Author：Mayuan
 * @Date 2020/3/5 16:32
 * @Description TODO
 * @Version 1.0
 * <p>
 * 查找矩阵中的一个元素。
 **/
public class FindMatrix {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int row = matrix.length, col = matrix[0].length;
        int i = col - 1, j = 0;
        while (i >= 0 && j < row) {
            if (matrix[j][i] > target) {
                i--;
            } else if (matrix[j][i] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] nums = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30},
        };
        int target = 8;
        System.out.println(findNumberIn2DArray(nums, target));
    }
}


