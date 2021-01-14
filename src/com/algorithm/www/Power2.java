package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->Power2
 * @description: Java实现幂运算。
 * @author: MaYuan
 * @create: 2020-01-27 15:20
 * @version: 1.0
 **/
public class Power2 {

    private static double power2(double base, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return base;
        }
        double half = power2(base, n / 2);
        if ((n & 1) == 0) {
            return half * half;
        } else {
            return base * half * half;
        }
    }

    private static double myPow(double base, int n) {
        if (n < 0) {
            return 1 / power2(base, -n);
        } else {
            return power2(base, n);
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0000, -2));
    }
}
