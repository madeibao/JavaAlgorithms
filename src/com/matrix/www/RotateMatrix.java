package com.matrix.www;

import java.util.Scanner;

/**
 * @program: Pro1->RotateMatrix
 * @description: 矩阵的旋转
 * @author: MaYuan
 * @create: 2019-12-23 19:10
 * @version: 1.0
 * * 将一个矩阵你的内容进行顺时针的旋转90度的操作。
 * *  4
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 * *---------------------------
 * 13 9 5 1
 * 14 10 6 2
 * 15 11 7 3
 * 16 12 8 4
 **/
public class RotateMatrix {
    private static void rotate(int[][] matrix) {
        //代表的是行。  左上角的位置。
        int tR = 0;
        //代表的是列。  右下角的位置。
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while (tR < dR) {
            rotateEdge(matrix, tR++, tC++, dR--, dC--);
        }
    }

    private static void rotateEdge(int[][] matrix, int tR, int tC, int dR, int dC) {
        int times = dR - tR;
        for (int i = 0; i < times; i++) {
            int temp = matrix[tR][tC + i];
            matrix[tR][tC + i] = matrix[dR - i][tC];
            matrix[dR - i][tC] = matrix[dR][dC - i];
            matrix[dR][dC - i] = matrix[tR + i][dC];
            matrix[tR + i][dC] = temp;
        }
    }

    /**
     * 下面是打印矩阵的内容。
     */

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        rotate(matrix);
        printMatrix(matrix);
        sc.close();
        /**
         * 先输入一个数字代表的是行数和列数。
         * 然后输入矩阵的内容。
         */
    }
}
