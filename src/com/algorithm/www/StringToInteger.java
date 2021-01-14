package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->StringToInteger
 * @description: 字符串变成个整数
 * @author: MaYuan
 * @create: 2020-01-16 19:01
 * @version: 1.0
 **/
public class StringToInteger {
    public static int myAtoi(String str) {

        // 去除空格内容。
        str = str.trim();

        if (str == null || str.length() == 0) {
            return 0;
        }

        char firstChar = str.charAt(0);
        int signal = 1;
        long res = 0;
        int start = 0;

        if (firstChar == '+') {
            signal = 1;
            start += 1;
        } else {
            if (firstChar == '-') {
                signal = -1;
                start += 1;
            }
        }

        for (int i = start; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return (int) res * str.charAt(i);
            }
            res = res * 10 + str.charAt(i) - '0';
            if (signal == 1 && res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (signal == -1 && res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int) res * signal;
    }

    public static void main(String[] args) {
        String str = "+123";
        System.out.println(myAtoi(str));
    }
}


