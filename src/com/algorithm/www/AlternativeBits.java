package com.algorithm.www;

import java.util.Stack;

/**
 * @program: JavaWorkSpace2->AlternativeBits
 * @description: 一个数字是否为交替的二进制的数字来进行表示
 * @author: MaYuan
 * @create: 2020-02-08 14:48
 * @version: 1.0
 **/

public class AlternativeBits {

    public static String reverseOnlyLetters(String s) {

        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++) {
            if(Character.isLetter(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if(Character.isLetter(s.charAt(i))) {
                sb.append(stack.pop());
            }
            else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }



    public static void main(String[] args) {
        String s = "ab-cd";
        System.out.println(reverseOnlyLetters(s));
    }
}
