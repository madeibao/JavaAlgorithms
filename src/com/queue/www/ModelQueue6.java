package com.queue.www;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName ModelQueue6
 * @Author：Mayuan
 * @Date 2020/11/26/0026 21:05
 * @Description TODO
 * @Version 1.0
 * <p>
 * 用队列来模型栈
 * 两个队列来模型栈的实现。
 **/
public class ModelQueue6 {

    // 输入队列
    private Queue<Integer> a;

    // 输出队列
    private Queue<Integer> b;

    public ModelQueue6() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }

    public void push(int x) {
        a.offer(x);

        // b 队列中的所有元素全部的都转给b队列。
        while (!b.isEmpty()) {
            a.offer(b.poll());
        }

        // 两个队列的内容来进行交换。
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

    public boolean isEmpty() {
        return b.isEmpty();
    }

    public static void main(String[] args) {
        ModelQueue6 mm = new ModelQueue6();
        mm.push(2);
        mm.push(2);
        mm.push(1);
        System.out.println(mm.pop());
    }
}
