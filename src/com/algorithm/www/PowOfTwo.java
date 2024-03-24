package com.algorithm.www;

/**
 * @ClassName PowOfTwo
 * @Author：Mayuan
 * @Date 2020/3/21 15:59
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断是否为2的幂指数
 **/
public class PowOfTwo {

    private static boolean isPow(int num) {
        return (num > 0) && ((num & (num - 1)) == 0);
    }

    public static void main(String[] args) {
        System.out.println(isPow(2));
    }
}
