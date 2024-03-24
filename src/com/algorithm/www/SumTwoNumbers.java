package com.algorithm.www;

import java.math.BigInteger;

/**
 * @program: JavaWorkSpace2->SumTwoNumbers
 * @description: 不用加法求两个数的和
 * @author: MaYuan
 * @create: 2020-02-05 17:08
 * @version: 1.0
 * <p>
 * 不用加减法来实现两个数字的求和
 **/
public class SumTwoNumbers {
    private static int getSum(int a, int b) {
        while (b != 0) {
            int temp = a ^ b;
            b = (a & b) << 1;
            a = temp;
        }
        return a;
    }

    private static int getSum5(int a, int b) {
        if (b == 0) {
            return a;
        }
        int step = a & b;
        step <<= 1;
        return getSum5(a ^ b, step);
    }

    private static int getSum2(int a, int b) {
        return Math.addExact(a, b);
    }

    /**
     * 两个数字的加和。
     *
     * @param a
     * @param b
     * @return
     */
    private static int getSum3(int a, int b) {
        BigInteger i = new BigInteger(Integer.toString(a));
        BigInteger j = new BigInteger(Integer.toString(b));
        return i.add(j).intValue();
    }

    private static int getSum4(int a, int b) {
        if (a == 0 || b == 0) {
            return a != 0 ? a : b;
        }
        if (b < 0) {
            while (b != 0) {
                a--;
                b++;
            }
        } else {
            while (b != 0) {
                a++;
                b--;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(getSum5(a, b));
    }
}
