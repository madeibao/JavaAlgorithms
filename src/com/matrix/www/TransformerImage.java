package com.matrix.www;

/**
 * @program: Pro1->TransformerImage
 * @description: 矩阵的转置的操作
 * @author: MaYuan
 * @create: 2019-12-23 19:15
 * @version: 1.0
 * 一个矩阵的转置。
 **/
public class TransformerImage {
    public static int[][] transformImage(int[][] temp, int n) {
        // write code here
        //从零开始创建一个空的二维度矩阵。
        int[][] data3 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //这一步实现矩阵的转置的操作。
                data3[j][i] = temp[i][j];
            }
        }
        return data3;

    }

    /**
     * 打印矩阵
     *
     * @param args
     */
    private static void printMatrix(int[][] data2) {
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                System.out.print(data2[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] data = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9},};
        printMatrix(data);
        int[][] data2 = new int[3][3];
        data2 = transformImage(data, 3);
        System.out.println();
        printMatrix(data2);
    }
}
