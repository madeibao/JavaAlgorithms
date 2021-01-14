package com.matrix.www;

import java.util.Scanner;

/**
 * @ClassName MirrorMatrix
 * @Author：Mayuan
 * @Date 2020/6/17 21:40
 * @Description TODO
 * @Version 1.0
 * <p>
 * 求一个矩阵的镜像。
 * 矩阵的左右的位置来进行镜像。
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * <p>
 * #=====
 * 3 2 1
 * 6 5 4
 * 9 8 7
 **/
public class MirrorMatrix {
    public static void main(String[] args) {
        int N = 3;
        Scanner sc = new Scanner(System.in);
        int[][] range = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                range[i][j] = sc.nextInt();
            }
        }
        exchangeRange(range);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(range[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void exchangeRange(int[][] range) {
        int row = 0;
        int col = range.length - 1;
        for (int i = 0; i < range.length / 2; i++) {
            for (int j = 0; j < range.length; j++) {
                int temp = range[j][row];
                range[j][row] = range[j][col];
                range[j][col] = temp;
            }
            row++;
            col--;
        }
    }
}
