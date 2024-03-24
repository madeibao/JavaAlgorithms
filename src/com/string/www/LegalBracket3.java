package com.string.www;

import java.util.Stack;

/**
 * @ClassName LegalBracket3
 * @Author：Mayuan
 * @Date 2020/6/9 19:43
 * @Description TODO
 * @Version 1.0
 * <p>
 * 合法的括号匹配。
 * 利用栈来判断是否为合法的匹配的括号值。
 **/
public class LegalBracket3 {
    private static boolean legal(String s) {

        // 首先是声明一个栈。
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }
        // 返回最后的栈是否为空的栈。
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(legal("()"));
    }
}


