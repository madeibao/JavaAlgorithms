package com.algorithm.www;

/**
 * @ClassName Power3
 * @Author：Mayuan
 * @Date 2020/3/3 12:12
 * @Description TODO
 * @Version 1.0
 * <p>
 * 指数运算
 **/

public class Power3 {

    private static double pow(double base, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return base;
        }

        int half = n / 2;
        if (n < 0) {
            half = -half;
            base = 1 / base;
        }

        double temp = pow(base, half);
        if (n % 2 == 1) {
            return base * temp * temp;
        } else {
            return temp * temp;
        }
    }

    public static void main(String[] args) {
        double temp = 2.0;
        int n = 10;
        System.out.println(pow(temp, n));
    }
}
