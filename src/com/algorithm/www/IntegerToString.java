package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->IntegerToString
 * @description: 整数变字符串
 * @author: MaYuan
 * @create: 2020-01-08 20:45
 * @version: 1.0
 * 将一个整数的类型的数字变成字符串类型的数字内容。
 **/
public class IntegerToString {

    private static String intToString(int num) {
        StringBuffer sb = new StringBuffer();
        while (num != 0) {
            int temp = num % 10;
            sb.append(temp);
            num /= 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int num = 12345;
        String temp = intToString(num);
        System.out.println(temp);
    }
}
