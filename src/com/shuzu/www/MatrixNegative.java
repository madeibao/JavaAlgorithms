package com.shuzu.www;

/**
 * @ClassName MatrixNegative
 * @Author：Mayuan
 * @Date 2020/2/18 11:26
 * @Description TODO
 * @Version 1.0
 * <p>
 * 求一个给定的矩阵中的负数的内容。
 * 注意矩阵是
 * 给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。
 * <p>
 * 请你统计并返回 grid 中 负数 的数目
 **/

public class MatrixNegative {
    public static int countNegatives(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int ans = 0;
        for (int[] row : grid) {
            int i = binarySearch(row);
            ans += row.length - i;
        }
        return ans;
    }

    private static int binarySearch(int[] row) {
        int l = 0, r = row.length - 1, mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (row[mid] >= 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[][] nums = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        System.out.println(countNegatives(nums));
    }
}



