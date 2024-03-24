package com.dprogram.www;

import java.util.Scanner;

/**
 * @program: Pro1->MaxPathNumber
 * @description: 三角形的路径之和为最大值
 * @author: MaYuan
 * @create: 2019-12-25 18:11
 * @version: 1.0
 * 3
 * 3      2
 * 4     5     1
 * 1    3     4     1
 * 每个点只能选择向左或向右走，取一条路径，使得路径上数字和最大。
 * 无需求出路径，求出最大值。
 * 输入n，和 n 行数字三角形 n<=100
 * <p>
 * 思路：递归解决
 * 用二维数组 d[ l ][ r ] 存数字三角形
 * if ( l  ==  n) maxSum( l , r ) = d [ l ][ r ] ;
 * else maxSum ( l , r ) = max { maxSum( l+1, r ) , maxSum( l+1, r+1 ) }
 * 很简单呀
 * 输入的形式为如下所示：
 * 3
 * 1
 * 12 3
 * 12 3 4
 **/

public class MaxPathNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println(add(a, n));
        input.close();
    }

    /**
     * 这里调用的是递归的写法来实现。
     *
     * @param b
     * @param n
     * @return
     */
    public static int add(int[][] b, int n) {
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                b[i][j] += max(b[i + 1][j], b[i + 1][j + 1]);
            }
        }
        //这里从下向上进行判定。不然从上向下的还要进行再次比较大小。
        return b[0][0];

    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}