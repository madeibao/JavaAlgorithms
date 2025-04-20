package com.string2.www;

import java.util.ArrayDeque;
import java.util.HashMap;

/**
 * @ClassName LegalString
 * @Author：Mayuan
 * @Date 2021/3/30/0030 19:50
 * @Description TODO
 * @Version 1.0
 *
 * 合法的括号序列。
 * 合理合法的字符串序列。
 * 用ArrayDeque 来代替Stack栈
 **/
public class LegalString {

    static boolean legalString(String str) {
        HashMap<Character, Character> map2 = new HashMap<>();
        map2.put(')', '(');
        map2.put(']', '[');
        map2.put('}', '{');
        ArrayDeque<Character> stack = new ArrayDeque<>();

        char[] ch = str.toCharArray();
        for (char c : ch) {
            // 如果栈是空的栈。
            if (stack.isEmpty()) {
                stack.push(c);
            } else if (stack.peek() == map2.get(c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "()[]";
        System.out.println(legalString(str));
    }
}
