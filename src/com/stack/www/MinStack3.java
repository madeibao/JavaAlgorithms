package com.stack.www;

import java.util.Stack;

/**
 * @ClassName MinStack3
 * @Author：Mayuan
 * @Date 2020/12/16/0016 18:47
 * @Description TODO
 * @Version 1.0
 **/
public class MinStack3 {

    /**
     * 一个用来存储真正的数字。
     */
    Stack<Integer> stackData;

    /**
     * 一个用来存储栈中的最小的数字。
     */
    Stack<Integer> stackMin;

    public MinStack3() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int x) {

        if (stackMin.size() == 0 || x < stackMin.peek()) {
            stackMin.push(x);
        } else {
            stackMin.push(stackMin.peek());
        }
        stackData.push(x);
    }

    public int pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("your stack is empyt()");
        }
        this.stackMin.pop();
        // 返回的是栈顶部的元素。
        return this.stackData.pop();
    }

    public int top() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("your stack is empyt()");
        }
        return this.stackData.peek();
    }

    public int getMin() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("your stack is empyt()");
        }
        return this.stackMin.peek();
    }

    public static void main(String[] args) {

        MinStack3 stack = new MinStack3();
        stack.push(2);
        stack.push(1);
        stack.push(3);
        System.out.println(stack.getMin());
    }
}
