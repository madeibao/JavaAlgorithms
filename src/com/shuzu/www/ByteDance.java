package com.shuzu.www;

import java.util.Scanner;

/**
 * @ClassName ByteDance
 * @Author：Mayuan
 * @Date 2020/5/23 22:24
 * @Description TODO
 * @Version 1.0
 * <p>
 * 两个长度为n的序列a, b，问有多少个区间[l,r]满足如下式子：
 * max(a[l,r])<min(b[l,r]),0≤l≤r<nmax(a[l,r])<min(b[l,r]),0≤l≤r<n
 * 即a区间的最大值小于b区间的最小值。
 * 数值范围： n<1e5, aibi<1e9
 * <p>
 * 输入描述
 * 第一行一个整数n
 * 第二行n个数，第i个为ai
 * 第三行n个数，第i个为bi
 * 输出描述
 * 一行一个整数，表示答案
 * 1
 * 示例
 * 输入
 * 3
 * 3 2 1
 * 3 3 3
 * 输出
 * 3
 * ————————————————
 * 版权声明：本文为CSDN博主「Asun0204」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/Asun0204/article/details/81606180
 **/
public class ByteDance {
    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n];
        int[] b = new int[n];
        String[] sa = sc.nextLine().split(" ");
        String[] sb = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sa[i]);
            b[i] = Integer.parseInt(sb[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (getMax(a, i, j) < getMin(b, i, j)) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }

    private static int getMin(int[] b, int i, int j) {
        int min = Integer.MAX_VALUE;
        for (int k = i; k <= j; k++) {
            min = Math.min(min, b[k]);
        }
        return min;
    }

    private static int getMax(int[] a, int i, int j) {
        int max = Integer.MIN_VALUE;
        for (int k = i; k <= j; k++) {
            max = Math.max(max, a[k]);
        }
        return max;
    }
}
