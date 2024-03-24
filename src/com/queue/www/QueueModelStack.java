package com.queue.www;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @ClassName QueueModelStack
 * @Author：Mayuan
 * @Date 2020/11/25/0025 22:01
 * @Description TODO
 * @Version 1.0
 * <p>
 * 两个队列来模拟栈的实现。
 **/

public class QueueModelStack {

    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new ArrayDeque<>();

    public void push(int node) {
        //两个栈都为空时，优先考虑queue1
        if (queue1.isEmpty() && queue2.isEmpty()) {
            queue1.add(node);
            return;
        }

        //如果queue1为空，queue2有元素，直接放入queue2
        if (queue1.isEmpty()) {
            queue2.add(node);
            return;
        }

        // 队列2 为空，直接的放入栈中。
        if (queue2.isEmpty()) {
            queue1.add(node);
            return;
        }
    }

    public int pop() {
        //两个栈都为空时，没有元素可以弹出,空栈没有办法弹出元素。
        if (queue1.isEmpty() && queue2.isEmpty()) {
            try {
                throw new Exception("stack is empty");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        //如果queue1为空，queue2有元素， 将queue2的元素依次放入queue1中，直到最后一个元素，我们弹出。
        if (queue1.isEmpty()) {
            while (queue2.size() > 1) {
                queue1.add(queue2.poll());
            }
            return queue2.poll();
        }

        if (queue2.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
            return queue1.poll();
        }

        // 返回的是整形的数值。
        return (Integer) null;
    }

    public static void main(String[] args) {
        QueueModelStack demo08 = new QueueModelStack();
        demo08.push(1);
        demo08.push(2);
        demo08.push(3);
        demo08.push(4);
        System.out.println(demo08.pop());
        System.out.println(demo08.pop());
        demo08.push(5);
        System.out.println(demo08.pop());
        System.out.println(demo08.pop());
        System.out.println(demo08.pop());
    }
}





