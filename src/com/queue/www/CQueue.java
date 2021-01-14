package com.queue.www;

/**
 * @ClassName ModelQueue2
 * @Author：Mayuan
 * @Date 2020/3/16 17:23
 * @Description TODO
 * @Version 1.0
 * <p>
 * 用栈来进行模型Queue。
 **/

import java.util.Stack;

public class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int size;

    /** 构造函数来进行初始化的操作。*/
    public CQueue() {

        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
        size = 0;
    }

    /**
     *    队列满足先进先出的特性，所以从尾部的元素来进行添加。
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

    public int deleteHead() {

        if (size == 0) {
            return -1;
        }
        size--;
        return stack1.pop();
    }


    public static void main(String[] args) {

        CQueue cc = new CQueue();
        cc.appendTail(1);
        cc.appendTail(2);
        cc.appendTail(3);
        cc.appendTail(4);
        cc.appendTail(5);
        cc.appendTail(6);

        System.out.println(cc.deleteHead());
    }
}