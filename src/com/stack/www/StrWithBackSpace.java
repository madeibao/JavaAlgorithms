package com.stack.www;

import java.util.ArrayDeque;

/**
 * # 表示退格键盘，然后比较下两个字符串是否相等
 * @ClassName StrWithBackSpace
 * @Author：Mayuan
 * @Date 2025/3/16/星期日 12:22
 * @Description TODO
 * @Version 1.0
 **/
public class StrWithBackSpace {

    public static boolean backspaceCompare(String s, String t) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        ArrayDeque<Character> stack2 = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        for (char c2 : t.toCharArray()) {
            if (c2 != '#') {
                stack2.push(c2);
            } else {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            }
        }
        while (!stack2.isEmpty() && !stack.isEmpty()) {
            if (stack2.pop() != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        String s = "xywrrmp", t = "xywrrmu#p";
        System.out.println(backspaceCompare(s,t));
    }
}
