package com.algorithm.www;

import java.util.Stack;

/**
 * @ClassName LegalBrackets2
 * @Author：Mayuan
 * @Date 2020/5/6 9:51
 * @Description TODO
 * @Version 1.0
 * <p>
 * 合法的括号字符串结果值。
 * <p>
 * 给出括号者数字的长度值。
 **/
public class LegalBrackets2 {

    public boolean chkParenthesis2(String A, int n) {
        // write code here
        /*
         * 1.碰到")"开始弹出栈顶的"("，如果此时栈为空，则返回false
         * 2.碰到其他内容直接返回false
         * 3.字符串结尾时，栈非空返回false
         */
        Stack<Character> lefts = new Stack<Character>();
        if (A == null || A.length() != n) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '(') {
                lefts.push(A.charAt(i));
            } else if (A.charAt(i) == ')') {
                if (lefts.empty()) {
                    return false;
                } else {
                    lefts.pop();
                }
            } else {
                return false;
            }
        }
        if (!lefts.empty()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean chkParenthesis(String A, int n) {
        // write code here
        int num = 0;
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '(') {
                num++;
            } else if (A.charAt(i) == ')') {
                num--;
            } else {
                if (num == 0) {
                    return false;
                }
            }

            if (num < 0) {
                return false;
            }
        }
        if (num == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "(()())";
        int n = 6;
        System.out.println(chkParenthesis(s, n));
    }
}
