package com.shuzu.www;

/**
 * @ClassName SetZeros2
 * @Author：Mayuan
 * @Date 2020/5/18 20:45
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java的设置矩阵归零。
 **/
public class SetZeros2 {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1},
        };
        setZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] tmp = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tmp[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (tmp[i][j] == 0) {
                    for (int m = 0; m < row; m++) {
                        matrix[m][j] = 0;
                    }
                    for (int n = 0; n < col; n++) {
                        matrix[i][n] = 0;
                    }
                }
            }
        }
    }
}
