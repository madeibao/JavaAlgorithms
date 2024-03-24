package com.string.www;

/**
 * @ClassName LegalBracket6
 * @Author：Mayuan
 * @Date 2021/2/25/0025 17:04
 * @Description TODO
 * @Version 1.0
 *
 * 合理合法的括号
 **/
import java.util.Stack;

public class LegalBracket6 {
    /**
     *
     * @param s string字符串
     * @return bool布尔型
     */
    public boolean isValid (String s) {
        if((s.length() & 1) == 1){
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for(char alp : s.toCharArray()) {
            if(alp == '(') {
                stack.push(')');
            }else if(alp == '[') {
                stack.push(']');
            }else if(alp == '{') {
                stack.push('}');
            }else if(stack.isEmpty() || stack.pop()!= alp) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        // write code here
        Stack<Character> stack2 =new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(') stack2.push(')');
            else if(c=='[') stack2.push(']');
            else if(c=='{') stack2.push('}');
            else if(stack2.isEmpty() || stack2.pop()!=c) return false;
        }
        return stack2.isEmpty();
    }


    public static void main(String[] args) {
        String str2 = "(){}";
        LegalBracket6 ll =new LegalBracket6();
        System.out.println(ll.isValid(str2));
    }
}
