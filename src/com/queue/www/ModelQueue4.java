package com.queue.www;

import java.util.Stack;

/**
 * @ClassName ModelQueue4
 * @Author：Mayuan
 * @Date 2020/11/15 20:58
 * @Description TODO
 * @Version 1.0
 **/
public class ModelQueue4 {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int size;

    public ModelQueue4() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        size = 0;
    }

    /**
     * 链表的末位来添加元素。
     */
    public void appendTail(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        size++;
    }

    /**
     * 队列元素出栈。
     *
     * @return
     */
    public int deleteHead() {
        if (size == 0) {
            return -1;
        }
        size--;
        return stack1.pop();
    }
}
