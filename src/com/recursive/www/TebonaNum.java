package com.recursive.www;

/**
 * @program: Pro1->TebonaNum
 * @description: 泰斐波那契数列
 * @author: MaYuan
 * @create: 2019-12-23 21:26
 * @version: 1.0
 **/
public class TebonaNum {
    private static int tribonacci(int n) {
        if (n <= 1) {
            //n=2时，返回f3的值为1.
            return n;
        }
        int f1 = 0;
        int f2 = 1;
        int f3 = 1;
        for (int i = 3; i <= n; i++) {
            int tmp = f3;
            f3 = f1 + f2 + f3;
            f1 = f2;
            f2 = tmp;
        }
        return f3;
    }

    private static int tribonacci2(int n) {
        if (n <= 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        result[2] = 1;
        result[3] = 2;
        for (int i = 4; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }
        return result[n];

    }

    public static void main(String[] args) {

        System.out.println(tribonacci2(4));
        System.out.println(tribonacci(4));
    }
}
