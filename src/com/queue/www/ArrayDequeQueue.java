package com.queue.www;

import java.util.ArrayDeque;

/**
 * @ClassName ArrayDequeQueue
 * @Author：Mayuan
 * @Date 2023/8/2/0002 22:08
 * @Description TODO
 * @Version 1.0
 **/
public class ArrayDequeQueue {
    public static void main(String[] args) {
        // 左边的ArrayDeque可以换成java.util.Queue，相当于向上转型，会只留下add()和remove()方法。见图论中BFS的实现

        ArrayDeque<String> queue = new ArrayDeque<>();
        // 入队
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("C++");
        System.out.println(queue);

        // 出队
        System.out.println(queue.poll());
        System.out.println(queue);

        // 打印队首元素，但是并不出队
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
