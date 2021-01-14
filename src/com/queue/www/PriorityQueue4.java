package com.queue.www;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @ClassName Priority
 * @Author：Mayuan
 * @Date 2020/5/17 19:23
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 构建一个大的顶堆。
 **/
public class PriorityQueue4 {

    public static void main(String[] args) {
        // 这里创建的是一个大顶堆的值。
        PriorityQueue<Integer> queue2 = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));
        queue2.add(3);
        queue2.add(4);
        queue2.add(5);
        queue2.add(1);

        while (!queue2.isEmpty()) {
            System.out.println(queue2.poll());
        }
        // 另外的建立大顶堆的方法

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 - integer;
            }
        });

        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
