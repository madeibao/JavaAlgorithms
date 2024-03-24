package com.string.www;

import java.util.Stack;

/**
 * @ClassName StringOperation
 * @Author：Mayuan
 * @Date 2020/5/3 10:13
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的逆波兰的运算的结果
 **/
public class StringOperation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> numStack = new Stack<>();
        Integer op1, op2;
        for (String s : tokens) {
            switch (s) {
                case "+":
                    op2 = numStack.pop();
                    op1 = numStack.pop();
                    numStack.push(op1 + op2);
                    break;
                case "-":
                    op2 = numStack.pop();
                    op1 = numStack.pop();
                    numStack.push(op1 - op2);
                    break;
                case "*":
                    op2 = numStack.pop();
                    op1 = numStack.pop();
                    numStack.push(op1 * op2);
                    break;
                case "/":
                    op2 = numStack.pop();
                    op1 = numStack.pop();
                    numStack.push(op1 / op2);
                    break;
                default:
                    numStack.push(Integer.valueOf(s));
                    break;
            }
        }
        return numStack.pop();
    }

    public static void main(String[] args) {
        String[] nums = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(nums));
    }
}

