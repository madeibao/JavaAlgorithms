package com.algorithm.www;

/**
 * @ClassName PowOfThree
 * @Author：Mayuan
 * @Date 2020/3/21 15:46
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断是否为3的幂指数
 **/
public class PowOfThree {

    public static boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            if (n % 3 == 0) {
                return isPowerOfThree(n / 3);
            } else {
                return false;
            }
        }
    }

    public static boolean isPowerOfThree3(int n) {
        int res = 1;
        while (res < n) {
            res *= 3;
        }
        return res == n;
    }

    public static boolean isPowerOfThree2(int n) {
        if (n == 0)
            return false;
        double i = Math.log10(n) / Math.log10(3);
        return i == (int) i;
    }

    public static void main(String[] args) {
        int num = 27;
        System.out.println(isPowerOfThree3(num));
    }
}
