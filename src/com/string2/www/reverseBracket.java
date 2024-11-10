package com.string2.www;

import java.util.Stack;

/**
 * @ClassName reverseBracket
 * @Author：Mayuan
 * @Date 2024/11/10/星期日 19:23
 * @Description TODO
 * @Version 1.0
 **/
public class reverseBracket {
    public static String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> buffer = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ')') {
                stack.push(s.charAt(i));
            } else {
                while (!stack.peek().equals('(')) {
                    buffer.push(stack.pop());
                }
                stack.pop();
                stack.addAll(buffer);
                buffer.clear();
            }
        }
        // 构造返回值
        StringBuilder ans = new StringBuilder();
        for (char c : stack) ans.append(c);
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "(u(love)i)";
        System.out.println(reverseParentheses(s));
    }
}
