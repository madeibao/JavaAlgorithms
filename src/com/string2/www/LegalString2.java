package com.string2.www;

import java.util.Stack;
/**
 * @ClassName LegalString2
 * @Author：Mayuan
 * @Date 2021/4/3/0003 21:39
 * @Description TODO
 * @Version 1.0
 *
 * 合理合法的字符串
 **/

public class LegalString2 {
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s==null) {
            return true;
        }

        char[] ch = s.toCharArray();
        for(char c:ch) {
            if(c=='(') {
                stack.push(')');
            }
            else if(c=='{') {
                stack.push('}');
            }
            else if(c=='[') {
                stack.push(']');
            }
            else if(stack.isEmpty()||stack.pop()!=c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("(){}"));
    }
}
