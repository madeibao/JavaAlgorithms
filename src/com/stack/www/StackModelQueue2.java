package com.stack.www;

import java.util.Stack;

/**
 * @program: Pro1->StackModelQueue2
 * @description: 用两个栈来模拟一个队列
 * @author: MaYuan
 * @create: 2019-12-24 21:56
 * @version: 1.0
 **/
public class StackModelQueue2 {
    // 输入栈
    private Stack<Integer> a;
    // 输出栈
    private Stack<Integer> b;

    public StackModelQueue2() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void push(int x) {
        a.push(x);
    }

    /**
     * 队列弹出元素的内容。
     */
    public int pop() {
        // 如果b栈为空，则将a栈全部弹出并压入b栈中，然后b.pop()
        if (b.isEmpty()) {
            while (!a.isEmpty()) {
                b.push(a.pop());
            }
        }
        return b.pop();
    }

    public int peek() {
        if (b.isEmpty()) {
            while (!a.isEmpty()) {
                b.push(a.pop());
            }
        }
        return b.peek();
    }

    public boolean empty() {
        return a.isEmpty() && b.isEmpty();
    }

    public static void main(String[] args) {
        StackModelQueue2 ss = new StackModelQueue2();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        System.out.println(ss.peek());
    }
}
