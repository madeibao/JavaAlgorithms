package com.queue.www;

import java.util.Stack;

/**
 * @program: JavaWorkSpace2->ModelQueue
 * @description: 用栈来模拟队列
 * @author: MaYuan
 * @create: 2020-01-08 21:19
 * @version: 1.0
 **/
public class ModelQueue<E> {
    private Stack<E> s1 = new Stack<E>();
    private Stack<E> s2 = new Stack<E>();

    /**
     * synchronized 保证线程的安全。
     *
     * @param e
     */
    private synchronized void put(E e) {
        s1.push(e);
    }

    /**
     * 弹出的元素内容，就是栈顶元素。
     * @return
     */
    private synchronized E pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public synchronized boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        ModelQueue mo = new ModelQueue();
        mo.put(2);
        mo.put(3);
        System.out.println(mo.pop());
    }
}
