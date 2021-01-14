package com.string.www;

import java.util.Stack;

/**
 * @ClassName LegalBracketLength
 * @Author：Mayuan
 * @Date 2020/11/12 21:17
 * @Description TODO
 * @Version 1.0
 * 合法的括号的长度的值。
 * 括号的长度值。
 **/
public class LegalBracketLength {

    public static int longestValidParentheses(String s) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                //下标入栈
                stack.push(i);
            } else {
                // 出栈
                stack.pop();
                // 看栈顶是否为空，为空的话就不能作差了
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    // i - 栈顶，获得档期有效括号长度
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "()()()(()";
        System.out.println(longestValidParentheses(str));

    }
}
