package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->PowerOfThree
 * @description: 判断是否为3的幂指数
 * @author: MaYuan
 * @create: 2020-01-14 20:22
 * @version: 1.0
 **/
public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        int temp = 1;
        while (temp < n) {
            temp *= 3;
        }
        return temp == n;
    }

    private static boolean isPowerOfThree2(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree2(27));
    }
}
