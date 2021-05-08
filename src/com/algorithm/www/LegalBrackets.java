package com.algorithm.www;

import java.util.Stack;

/**
 * @program: JavaWorkSpace2->LegalBrackets
 * @description: 合法的括号内容
 * @author: MaYuan
 * @create: 2020-02-08 15:08
 * @version: 1.0
 **/


public class LegalBrackets {

    private static boolean isSym(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (stack.size() == 0) {
                stack.push(ch);
            } else if (isSym(stack.peek(), ch)) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        String s = "(){}";
        System.out.println(isValid(s));
    }
}
