package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->Exponent
 * @description: Java的指数的运算内容
 * @author: MaYuan
 * @create: 2019-12-26 18:15
 * @version: 1.0
 * 实现浮点数字的指数的运算结果。
 **/
public class Exponent {
    private static double expo(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }

        int half = exponent / 2;
        if (exponent < 0) {
            half = -half;
            base = 1 / base;
        }
        double result = expo(base, half);
        if ((exponent & 1) == 0) {
            return result * result;
        } else {
            return base * result * result;
        }
    }

    public static void main(String[] args) {
        double num = 0.0000001;
        int num2 = 2;
        System.out.println(expo(num, num2));
    }
}
