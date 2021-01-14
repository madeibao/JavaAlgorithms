package com.shuzu.www;

import java.util.Stack;

/**
 * @ClassName ReverserExpressionClac
 * @Author：Mayuan
 * @Date 2020/3/30 11:02
 * @Description TODO
 * @Version 1.0
 * <p>
 * 逆波兰式的计算
 **/
public class ReverserExpressionCalc {
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

                // 默认的条件下，直接的放入其中的值。
                default:
                    numStack.push(Integer.valueOf(s));
                    break;
            }
        }
        return numStack.pop();
    }

    public static void main(String[] args) {

        String[] strs = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(strs));
    }

}
