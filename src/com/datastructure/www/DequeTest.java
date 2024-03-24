package com.datastructure.www;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @ClassName DequeTeset
 * @Author：Mayuan
 * @Date 2023/11/6/0006 18:29
 * @Description TODO
 * @Version 1.0
 *
 * Deque 是一个双端队列
 *
 * Deque表示双端队列。双端队列是在两端都可以进行插入和删除的队列。
 *
 * 常用方法：
 *
 * 新建一个双端队列：Deque<Character> deque = new LinkedList<Character>();
 * 判断是否为空： deque.isEmpty()
 * 增：deque.offerFirst()， deque.offerLast();//从头添加和尾部添加
 * 删：deque.pollFirst()， deque.pollLast()//从头添加和尾部出队
 * 查：deque.peekFirst(), deque.peekLast()//查看头添加和尾部元素
 *
 **/
public class DequeTest {

    public static void main(String[] args) {
        Deque<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        Iterator<Integer> it = queue.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }

        System.out.println("----------------------------------");
        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());

        System.out.println("------------------------------------");

        queue.offerFirst(10);
        Iterator<Integer> it2 = queue.iterator();
        while (it2.hasNext()) {
            System.out.print(it2.next()+" ");
        }
    }
}
