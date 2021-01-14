package com.matrix.www;

/**
 * @program: Pro1->TransposeMatrix
 * @description: 矩阵的转置
 * @author: MaYuan
 * @create: 2019-12-23 19:24
 * @version: 1.0
 **/
public class TransposeMatrix {

    public static void main(String[] args) {
        int[][] data = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("----------------转置前------------------------");
        print1(data);
        reverse(data);
        System.out.println("----------------转置后------------------------");
        print1(data);
    }

    /**
     * 矩阵转置
     *
     * @param temp
     */
    public static void reverse(int[][] temp) {
        for (int i = 0; i < temp.length; i++) {
            for (int j = i; j < temp[i].length; j++) {
                int k = temp[i][j];
                temp[i][j] = temp[j][i];
                temp[j][i] = k;
            }
        }
    }

    /**
     * 输出矩阵
     *
     * @param temp
     */
    public static void print1(int[][] temp) {
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.print(temp[i][j] + "\t");
            }
            System.out.println();
        }
    }
}