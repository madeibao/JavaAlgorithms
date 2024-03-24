package com.algorithm.www;

/**
 * @ClassName Power5
 * @Author：Mayuan
 * @Date 2020/6/14 10:36
 * @Description TODO
 * @Version 1.0
 * <p>
 * 给定一个数字判断是否为2的幂
 **/
public class Power5 {

    public static boolean isPow(int n) {
        for (int i = 0; i < 32; i++) {
            if (Math.pow(2, i) == n) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isPow(2));
    }
}
