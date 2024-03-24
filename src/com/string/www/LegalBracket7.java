package com.string.www;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @ClassName LegalBracket7
 * @Author：Mayuan
 * @Date 2021/2/25/0025 17:14
 * @Description TODO
 * @Version 1.0
 *
 * 合理合法的括号
 **/
public class LegalBracket7 {
    public static boolean isValid2 (String s) {
        // write code here
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(stack.empty()) {
                stack.push(ch);
            }
            else{
                if(map.get(ch) == stack.peek()) {
                    stack.pop();
                }
                else {
                    stack.push(ch);
                }
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        String str2 ="(){}";
        System.out.println(isValid2(str2));
    }
}
