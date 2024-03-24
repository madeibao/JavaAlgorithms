package com.algorithm.www;

import java.util.Stack;

/**
 * @program: JavaWorkSpace2->BinNumberAdd
 * @description: 两个二进制的数字相加
 * @author: MaYuan
 * @create: 2019-12-26 21:20
 * @version: 1.0
 **/
public class BinNumberAdd {
    public String addBinary(String a, String b) {
        if (a == null || a.length() == 0) {
            return b;
        }
        if (b == null || b.length() == 0) {
            return a;
        }

        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        // 进位
        // 从后面向前面相加求结果值。
        int c = 0;
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                c += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                c += b.charAt(j--) - '0';
            }
            sb.append(c % 2);
            // 右移动一个位置。
            c >>= 1;
        }

        String res = sb.reverse().toString();
        return c > 0 ? '1' + res : res;
    }

    public static String addBinary2(String a, String b) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            carry += i >= 0 ? a.charAt(i--) - '0' : 0;
            carry += j >= 0 ? b.charAt(j--) - '0' : 0;
            stack.push(carry % 2);
            carry = carry / 2;
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "11";
        String str2 = "11";
        System.out.println(new BinNumberAdd().addBinary(str1, str2));
    }
}



