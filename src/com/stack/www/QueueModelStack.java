package com.stack.www;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: JavaWorkSpace2->QueueModelStack
 * @description: 用队列来模拟栈的内容
 * @author: MaYuan
 * @create: 2020-01-02 21:04
 * @version: 1.0
 **/
public class QueueModelStack {
    /**
     * 输入队列
     */
    private Queue<Integer> a;
    /**
     * 输出队列。
     */
    private Queue<Integer> b;

    public QueueModelStack() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }

    public void push(int x) {
        a.offer(x);
        // 将b队列中元素全部转给a队列
        while (!b.isEmpty()) {
            a.offer(b.poll());
        }
        // 交换a和b,使得a队列没有在push()的时候始终为空队列
        Queue temp = a;
        a = b;
        b = temp;
    }

    public int pop() {
        return b.poll();
    }

    public int top() {
        return b.peek();
    }

    public boolean empty() {
        return b.isEmpty();
    }


}
