package com.string.www;

import java.util.Stack;

/**
 * @ClassName ExpressionCalculator2
 * @Author：Mayuan
 * @Date 2020/6/9 21:28
 * @Description TODO
 * @Version 1.0
 * <p>
 * 逆波兰表达式的计算。
 * 逆波兰表达式的计算。
 **/
public class ExpressionCalculator2 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> numStack = new Stack<>();
        Integer op1, op2;

        // Switch 语句里面也可以使用String表达式了。
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
        String[] str = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(str));
    }
}