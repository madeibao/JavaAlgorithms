package com.shuzu.www;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName SetZeros3
 * @Author：Mayuan
 * @Date 2020/5/18 20:49
 * @Description TODO
 * @Version 1.0
 * <p>
 * 将矩阵的行和列来置零的操作。
 **/
public class SetZeros3 {

    public static int[][] setZeroes(int[][] matrix) {
        //置零的行
        Set<Integer> rowList = new HashSet<>();
        //置零的列
        Set<Integer> colList = new HashSet<>();
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[a].length; b++) {
                if (matrix[a][b] == 0) {
                    rowList.add(a);
                    colList.add(b);
                }
            }
        }
        for (Integer row : rowList) {
            for (int c = 0; c < matrix[0].length; c++) {
                matrix[row][c] = 0;
            }
        }
        for (Integer column : colList) {
            for (int d = 0; d < matrix.length; d++) {
                matrix[d][column] = 0;
            }
        }
        return matrix;
    }

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

}
