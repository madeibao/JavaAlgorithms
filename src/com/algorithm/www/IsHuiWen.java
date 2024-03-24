package com.algorithm.www;

/**
 * @ClassName IsHuiWen
 * @Author：Mayuan
 * @Date 2020/3/3 16:12
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断一个数字是否为回文数字
 * 例如11是回文数字序列。
 **/
public class IsHuiWen {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rem, y = 0;
        int quo = x;
        while (quo != 0) {
            rem = quo % 10;
            y = y * 10 + rem;
            quo = quo / 10;
        }
        return y == x;
    }

    public static void main(String[] args) {
        int x = 11;
        System.out.println(isPalindrome(x));
    }
}
