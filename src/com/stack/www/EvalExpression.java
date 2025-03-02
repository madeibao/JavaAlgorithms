package com.stack.www;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @ClassName EvalExpression
 * @Author：Mayuan
 * @Date 2025/3/2/星期日 18:50
 * @Description TODO
 * @Version 1.0
 **/
public class EvalExpression {
    private static int getResult(String[] tokens) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int a = deque.pop();
                int b = deque.pop();
                int res = 0;
                switch (token) {
                    case "+":
                        res = b + a;
                        break;
                    case "-":
                        res = b - a;
                        break;
                    case "*":
                        res = b * a;
                        break;
                    case "/":
                        res = b / a;
                        break;
                }
                deque.push(res);
            } else {
                deque.push(Integer.valueOf(token));
            }
        }
        return deque.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(getResult(tokens));
    }
}
