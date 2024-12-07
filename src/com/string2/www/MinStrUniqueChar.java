package com.string2.www;

import java.util.Stack;

/**
 * 返回 s 字典序最小的
 * 子序列
 * ，该子序列包含 s 的所有不同字符，且只包含一次。
 *
 * 示例 1：
 *
 * 输入：s = "bcabc"
 * 输出："abc"
 *
 * @ClassName MinStrUniqueChar
 * @Author：Mayuan
 * @Date 2024/12/7/星期六 16:34
 * @Description TODO
 * @Version 1.0
 **/
public class MinStrUniqueChar {

    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.contains(c)) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > c && s.indexOf(stack.peek(), i) != -1) {
                stack.pop();
            }
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "bcabc";
        System.out.println(new MinStrUniqueChar().removeDuplicateLetters(str));
    }
}
