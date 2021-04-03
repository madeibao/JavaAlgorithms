package com.string2.www;

import java.util.HashMap;
import java.util.Stack;

/**
 * @ClassName LegalString
 * @Author：Mayuan
 * @Date 2021/3/30/0030 19:50
 * @Description TODO
 * @Version 1.0
 *
 * 合法的括号序列。
 * 合理合法的字符串序列。
 *
 **/
public class LegalString {

    static boolean legalString(String str) {

        HashMap<Character, Character> map2 =new HashMap<>();
        map2.put(')','(');
        map2.put(']','[');
        map2.put('}','{');

        Stack<Character> stack = new Stack<>();
        char[] ch = str.toCharArray();
        for(int i =0;i<ch.length;i++) {
            char c = ch[i];

            // 如果栈是空的栈。
            if(stack.isEmpty()) {
                stack.push(c);
            }
            else if(stack.peek() == map2.get(c)) {
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        String str ="()[]";
        System.out.println(legalString(str));

    }
}
