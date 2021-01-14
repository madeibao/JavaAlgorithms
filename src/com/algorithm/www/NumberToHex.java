package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->NumberToHex
 * @description: 十进制数字转换成16进制的数字
 * @author: MaYuan
 * @create: 2020-01-01 19:14
 * @version: 1.0
 **/
public class NumberToHex {
    public static String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',};
        StringBuilder sb = new StringBuilder();
        // int 整形是32位，16进制一个代表的是4位，所以不成超过8位。
        while (sb.length() < 8 && num != 0) {
            sb.append(chars[num & 0xf]);
            num >>= 4;
        }
        return sb.reverse().toString();
    }

    /**
     * 用的是同一个思想，但是，用位运算的效率会更高。
     *
     * @param num
     * @return 下面的方法只是对于正整数才能适用。
     */
    private static String toHex2(int num) {
        if (num == 0) {
            return "0";
        }
        char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 8 && num != 0) {
            sb.append(chars[num % 16]);
            num = num / 16;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(toHex2(65536));
    }
}




