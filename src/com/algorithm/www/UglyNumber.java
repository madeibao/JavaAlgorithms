package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->UglyNumber
 * @description: 判断是否为丑数
 * @author: MaYuan
 * @create: 2020-01-10 16:02
 * @version: 1.0
 * <p>
 * 判断是否为丑数的内容。
 **/
public class UglyNumber {
    private static boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        if (num % 2 == 0) {
            return isUgly(num / 2);
        }
        if (num % 3 == 0) {
            return isUgly(num / 3);
        }
        if (num % 5 == 0) {
            return isUgly(num / 5);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(15));
    }
}
