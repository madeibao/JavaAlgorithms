package com.ACompany.www;

import java.util.Scanner;

/**
 * @ClassName MeiTuan913
 * @Author：Mayuan
 * @Date 2020/9/13 14:26
 * @Description TODO
 * @Version 1.0
 **/
public class MeiTuan913 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, k, d;
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            k = sc.nextInt();
            d = sc.nextInt();
            for (int i = d; i < n; i++) {
                getMax(k, i, 0, n, 0);
            }
            System.out.println(max % 998244353);
        }
    }

    static int max = 0;

    public static void getMax(int k, int len, int count, int n, int sum) {
        if (count == len) {
            if (sum == n) {
                max++;
            }
            return;
        }
        if (sum > n) {
            return;
        }

        for (int i = 1; i <= k; i++) {
            sum += i;
            getMax(k, len, count + 1, n, sum);
            sum -= i;
        }
    }
}
