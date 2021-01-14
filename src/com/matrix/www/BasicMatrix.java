package com.matrix.www;

/**
 * @ClassName BaisicMatrix
 * @Author：Mayuan
 * @Date 2020/3/28 22:23
 * @Description TODO
 * @Version 1.0
 * 矩阵的基本的常识
 **/
public class BasicMatrix {

    public static void main(String[] args) {
        int[][] data = new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},};

        // 代表的是矩阵的行数
        int m = data.length;

        // 代表的是矩阵的列数。
        int n = data[0].length;

        System.out.println(m);
        System.out.println(n);


    }
}
