package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->NumberOfPower
 * @description: 判断一个数字是不是2的幂指数次方
 * @author: MaYuan
 * @create: 2019-12-28 21:27
 * @version: 1.0
 **/
public class NumberOfPowerTwo {
    private static boolean isPower(int n) {
        if ((n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPower(16));
    }
}
