package com.stack.www;

import java.util.Stack;

/**
 * @ClassName MinStack2
 * @Author：Mayuan
 * @Date 2020/12/14/0014 22:15
 * @Description TODO
 * @Version 1.0
 **/
public class MinStack2 {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MinStack2() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int num) {

        // 如果栈为空。
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(num);
        }
        // 当前的数字小于最小栈
        else if (num < this.getMin()) {
            this.stackMin.push(num);
        }

        // 当前的数字等于最小栈顶点元素，重复的追加。
        else {
            int newMin = this.stackMin.peek();
            this.stackMin.push(newMin);
        }
    }

    public int pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("your stack is Empty");
        }
        this.stackMin.pop();
        return this.stackData.pop();
    }

    public int getMin() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("your stack is Empty");
        }
        return this.stackMin.peek();
    }
}
