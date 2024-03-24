package com.string.www;

import java.util.Stack;

/**
 * @ClassName LegalBracket2
 * @Author：Mayuan
 * @Date 2020/6/9 16:17
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串中的合法的括号的最长的值。
 **/
public class LegalBracket2 {
    public static int longestValidParentheses(String s) {
        int max = 0, start = 0;
        if (null == s) {
            return 0;
        }

        int len = s.length();

        Stack<Integer> stack = new Stack<>();
        for (int index = 0; index < len; index++) {
            //遇左括号(，压栈(栈中元素为当前位置所处的下标)
            if ('(' == s.charAt(index)) {
                stack.push(index);
                continue;
            } else {
                if (stack.isEmpty()) {
                    start = index + 1;
                    continue;
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        max = Math.max(max, index - start + 1);
                    } else {
                        max = Math.max(max, index - stack.peek());
                    }
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String s = ")()()";
        System.out.println(longestValidParentheses(s));
    }
}
