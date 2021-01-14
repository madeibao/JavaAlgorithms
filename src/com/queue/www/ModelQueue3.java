package com.queue.www;

import java.util.Stack;

/**
 * @ClassName ModelQueue3
 * @Author：Mayuan
 * @Date 2020/5/6 22:21
 * @Description TODO
 * @Version 1.0
 * 模拟队列的结果值
 **/
public class ModelQueue3 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    /**
     * stack1 作为入队的队列元素。
     */
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {

        // 首先是栈2必须是为空的栈。
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                int node = stack1.pop();
                stack2.add(node);
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        ModelQueue3 ms = new ModelQueue3();
        ms.push(2);
        ms.push(3);
        System.out.println(ms.pop());
    }
}
