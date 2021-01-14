package com.string.www;

import java.util.Stack;

/**
 * @ClassName LegalBracket5
 * @Author：Mayuan
 * @Date 2020/11/12 20:59
 * @Description TODO
 * @Version 1.0
 * <p>
 * 合法的括号。
 * 这里的括号是同一种类型的括号。
 * 都是() () 这种的配对的形式。
 **/

public class LegalBracket5 {

    public static boolean isValid(String s) {

        if (s == null || s.length() < 1) {
            return true;
        }

        // 字符串长度
        int n = s.length();
        // 创建一个栈来装字符
        Stack<Character> stack = new Stack<>();
        // 遍历字符串
        for (int i = 0; i < n; i++) {
            // 获取字符串的第 i 个字符
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        // 判断是否为空
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * 算法来继续优化。
     *
     * @param args
     */
    public static boolean isValid2(String s) {
        if (s == null || s.length() < 1)
            return true;

        // 字符串长度
        int n = s.length();
        // 用来记录遇到的 "(" 的个数
        int sum = 0;
        // 遍历字符串
        for (int i = 0; i < n; i++) {
            // 获取字符串的第 i 个字符
            char c = s.charAt(i);
            if (c == '(') {
                sum++;
            } else {
                if (sum == 0)
                    return false;
                else
                    sum--;
            }
        }
        return sum == 0 ? true : false;
    }

    public static void main(String[] args) {
        String strs = "(())";
        System.out.println(isValid(strs));
    }
}
