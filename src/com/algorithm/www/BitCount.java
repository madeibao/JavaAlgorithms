package com.algorithm.www;

/**
 * @ClassName BitCount
 * @Author：Mayuan
 * @Date 2020/7/1 20:32
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个二进制数字的表示中的0的个数。
 **/
public class BitCount {

    public static int NumberOf0(int n) {
        int result = 0;
        while (n != -1) {
            ++result;
            n = n | (n + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf0(15));
    }
}
