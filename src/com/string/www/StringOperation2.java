package com.string.www;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName StringOperation2
 * @Author：Mayuan
 * @Date 2020/5/12 14:57
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的运算结果
 **/
public class StringOperation2 {
    public static int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int right = stack.pop();
                int left = stack.pop();
                if (s.equals("+")) stack.push(left + right);
                if (s.equals("-")) stack.push(left - right);
                if (s.equals("*")) stack.push(left * right);
                if (s.equals("/")) stack.push(left / right);
            } else {
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] nums = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(nums));
    }

}
