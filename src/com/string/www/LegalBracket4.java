package com.string.www;

import java.util.Stack;

/**
 * @ClassName LegalBracket4
 * @Author：Mayuan
 * @Date 2020/7/6 21:32
 * @Description TODO
 * @Version 1.0
 * <p>
 * 合法的括号序列。
 * 字符串中只要出现了非法的字符串，都会被认为不是合法的括号序列。
 **/
public class LegalBracket4 {
    public static boolean chkParenthesis(String A, int n) {
        // write code here

        if (A == null || A.length() == 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '(') {
                stack.push(A.charAt(i));
            } else if (A.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            } else {
                return false;
            }
        }

        if (!stack.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        String str = "(()())";
        int n = 6;

        System.out.println(chkParenthesis(str, n));
    }
}
