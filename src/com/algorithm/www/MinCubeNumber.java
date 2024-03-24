package com.algorithm.www;

import java.util.Scanner;

/**
 * @ClassName MinCubeNumber
 * @Author：Mayuan
 * @Date 2020/5/9 21:51
 * @Description TODO
 * @Version 1.0
 * <p>
 * 求一个数字的最少的用最少多少个立方和来组成
 * 题目描述
 * 给出一个数字N（0<N<1000000）,将N写成立方数和的形式，求出需要的最少立方数个数。
 * 例如N=17，1+8+8 = 17，最少需要3个立方数，则输出3。
 * N= 28,1+1+1+1+8+8+8=28, 需要7个立方数，1+27=28,需要2个立方数，所以最少立方数为2，则输出2。
 **/
public class MinCubeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            //用于保存最小的个数
            int min = Integer.MAX_VALUE;
            //找到最小的
            for (int j = 1; j * j * j <= i; j++) {
                min = Math.min(min, dp[i - j * j * j]);
            }
            dp[i] = min + 1;
        }
        System.out.println(dp[n]);
    }
}
