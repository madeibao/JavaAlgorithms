package com.queue.www;

import java.util.ArrayDeque;

/**
 * @ClassName ArrayDequeTest
 * @Author：Mayuan
 * @Date 2020/4/29 17:25
 * @Description TODO
 * @Version 1.0
 * <p>
 * 数组实现的双端队列模型
 **/
public class ArrayDequeTest {
    public static void main(String[] args) {
        // 初始化容量为4
        ArrayDeque<String> arrayDeque = new ArrayDeque<>(4);
        //添加元素
        arrayDeque.add("A");
        arrayDeque.add("B");
        arrayDeque.add("C");
        arrayDeque.add("D");
        arrayDeque.add("E");
        arrayDeque.add("F");
        arrayDeque.add("G");
        arrayDeque.add("H");
        arrayDeque.add("I");
        System.out.println(arrayDeque);

        // 获取元素
        String a = arrayDeque.getFirst();
        String a1 = arrayDeque.pop();
        String b = arrayDeque.element();
        String b1 = arrayDeque.removeFirst();
        String c = arrayDeque.peek();
        String c1 = arrayDeque.poll();
        String d = arrayDeque.pollFirst();
        String i = arrayDeque.pollLast();
        String e = arrayDeque.peekFirst();
        String h = arrayDeque.peekLast();
        String h1 = arrayDeque.removeLast();
        System.out.printf("a = %s, a1 = %s, b = %s, b1 = %s, c = %s, c1 = %s, d = %s, i = %s, e = %s, h = %s, h1 = %s", a, a1, b, b1, c, c1, d, i, e, h, h1);
        System.out.println();

        // 添加元素
        arrayDeque.push(e);
        arrayDeque.add(h);
        arrayDeque.offer(d);
        arrayDeque.offerFirst(i);
        arrayDeque.offerLast(c);
        arrayDeque.offerLast(h);
        arrayDeque.offerLast(c);
        arrayDeque.offerLast(h);
        arrayDeque.offerLast(i);
        arrayDeque.offerLast(c);
        System.out.println(arrayDeque);

        // 移除第一次出现的C
        arrayDeque.removeFirstOccurrence(c);
        System.out.println(arrayDeque);

        // 移除最后一次出现的C
        arrayDeque.removeLastOccurrence(c);
        System.out.println(arrayDeque);

    }
}