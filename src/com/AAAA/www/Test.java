package com.AAAA.www;

import java.util.HashMap;
import java.util.Stack;

/**
 * @program: Pro1->Test
 * @description: 基本测试文件
 * @author: MaYuan
 * @create: 2019-12-24 19:18
 * @version: 1.0
 **/

public class Test {

    static boolean isValid(String s){
        if(s==null) {
            return true;
        }

        HashMap<Character,Character> map2 =new HashMap<>();
        map2.put(')','(');
        map2.put(']','[');
        map2.put('}','{');

        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<ch.length;i++) {
            if(ch[i]=='('||ch[i]=='{'||ch[i]=='[') {
                st.push(ch[i]);
            }
            else if(!st.empty()&&map2.get(ch[i]).equals(st.peek())) {
                st.pop();
            }
            else {
                return false;
            }
        }

        return st.empty();
    }

    public static void main(String[] args) {
        String str ="(){}[][]";
        System.out.println(isValid(str));

    }
}

