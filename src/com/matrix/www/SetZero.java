package com.matrix.www;

/**
 *
 * @ClassName SetZero
 * @Author Mayuan
 * @Date 2026/6/12/星期五 16:54
 * @Version 1.0
 **/
public class SetZero {
    public void setZeroes(int[][] matrix) {
        boolean isCol = false;
        boolean isRow = false;

        for (int[] ints : matrix) {
            if (ints[0] == 0) {
                isCol = true;
                break;
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                isRow = true;
                break;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (isCol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        if (isRow) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
    }

    public static void main(String[] args) {


    }
}
