package com.string.www;

import java.util.Stack;

/**
 * @ClassName ValidString
 * @Author：Mayuan
 * @Date 2020/2/24 17:03
 * @Description TODO
 * @Version 1.0
 * <p>
 * 合法的括号内容
 **/
public class ValidStringBracket {

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}


