package com.AAAA.www;

import java.util.HashMap;
import java.util.Stack;

/**
 * @ClassName B
 * @Author：Mayuan
 * @Date 2020/12/30/0030 22:37
 * @Description TODO
 * @Version 1.0
 *
 **/

public class  B {

    static boolean isValid(String s) {
        if(s==null) {
            return true;
        }
        HashMap<Character,Character> map2 = new HashMap<>();
        map2.put(')','(');
        map2.put(']','[');
        map2.put('}','{');
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<ch.length;i++) {
            if(ch[i]=='['||ch[i]=='('||ch[i]=='{') {
                st.push(ch[i]);
            }
            else if(!st.empty()&&(map2.get(ch[i]).equals(st.peek()))) {
                st.pop();
            }
            else {
                return false;
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {

        String str = "()[]";
        System.out.println(isValid(str));
    }
}