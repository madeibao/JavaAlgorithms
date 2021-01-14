package com.stack.www;

import java.util.Stack;

/**
 * @ClassName MinStack
 * @Author：Mayuan
 * @Date 2020/3/5 15:52
 * @Description TODO
 * @Version 1.0
 * <p>
 * 通过构建一个栈，来返回的是栈中的最小的元素内容。
 * <p>
 * 这种特殊的栈，能够返回的是栈中的最小的元素。
 **/
public class MinStack {

    /**
     * initialize your data structure here.
     */
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        int peek = stack.peek();
        if (peek == minStack.peek()) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

    }
}

