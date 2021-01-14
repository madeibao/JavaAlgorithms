package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->AlternativeBits
 * @description: 一个数字是否为交替的二进制的数字来进行表示
 * @author: MaYuan
 * @create: 2020-02-08 14:48
 * @version: 1.0
 **/

public class AlternativeBits {
    public static boolean hasAlternatingBits(int n) {
        if (n == 1 || n == 2 || n == 0) {
            return true;
        }
        String str1 = Integer.toBinaryString(n);
        char[] ch = str1.toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ch[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(hasAlternatingBits(num));
    }
}
