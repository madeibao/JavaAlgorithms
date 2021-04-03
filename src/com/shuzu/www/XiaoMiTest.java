package com.shuzu.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName XiaoMiTest
 * @Author：Mayuan
 * @Date 2020/6/3 22:00
 * @Description TODO
 * @Version 1.0
 * 小米大礼包
 * <p>
 * 小米之家是成人糖果店。里面有很多便宜，好用，好玩的产品。中秋节快到了，小米之家想给米粉们准备一些固定金额大礼包。
 * 对于给定的一个金额，需要判断能不能用不同种产品（一种产品在礼包最多出现一次）组合出来这个金额。聪明的你来帮帮米家的小伙伴吧。
 * <p>
 * 输入描述:
 * <p>
 * 输入 N （N 是正整数， N  <= 200）
 * 输入 N 个价格p（正整数, p <= 10000）用单空格分割
 * 输入金额 M（M是正整数，M <= 100000 ）
 * 输出描述:
 * <p>
 * 能组合出来输出 1
 * 否则输出 0
 * 示例1
 * <p>
 * 输入

6
99 199 1999 10000 39 1499
10238
 * 输出
 * 1
 **/
public class XiaoMiTest {
    private static boolean can(int[] a, int t) {

        long[] dp = new long[t + 1];
        dp[0] = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = t; j >= a[i]; j--) {
                dp[j] += dp[j - a[i]];
            }
            if (dp[t] > 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        String[] ss = bf.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(ss[i]);
        }
        int m = Integer.parseInt(bf.readLine());
        if (can(a, m)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}