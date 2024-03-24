package com.string.www;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @ClassName LegalBracket8
 * @Author：Mayuan
 * @Date 2021/4/11/0011 22:18
 * @Description TODO
 * @Version 1.0
 *
 * 合法的括号。
 *
 **/
public class LegalBracket8 {
    public static boolean isValid2 (String s) {
        Map<Character,Character> map2 = new HashMap<>();

        map2.put(')','(');
        map2.put('}','{');
        map2.put(']','[');

        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i =0;i<ch.length;i++) {
            if(ch[i]=='(') {
                stack.push('(');
            }
            else if(ch[i]=='{') {
                stack.push('{');
            }
            else if(ch[i]=='[') {
                stack.push('[');
            }
            else if(!stack.isEmpty()&&stack.peek().equals(map2.get(ch[i]))) {
                stack.pop();
            }
            else {
                return false;
            }
        }

        return stack.empty();
    }
    public static void main(String[] args) {

        System.out.println(isValid2("()()[]{}"));
    }
}
