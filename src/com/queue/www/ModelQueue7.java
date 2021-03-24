package com.queue.www;

/**
 * @ClassName ModelQueue7
 * @Author：Mayuan
 * @Date 2020/12/13/0013 15:45
 * @Description TODO
 * @Version 1.0
 * <p>
 * 链表来模拟队列的生成。
 * 链表内容为：
 * <p>
 * public class LinkedNode {
 * int data;
 * LinkedNode next;
 * public LinkedNode(int x) {
 * this.data = x;
 * this.next = null;
 * }
 * }
 **/
public class ModelQueue7 {
    private LinkedNode head;
    private LinkedNode tail;
    private int size;

    public ModelQueue7() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    /**
     * 判断链表是否空。
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize2() {
        return size;
    }

    /**
     * 向队列里面来添加一个元素。
     * @param x
     */
    public void offer(int x) {

        // 如果是一空的队列，那么就直接的添加进去。
        if (size == 0) {
            head = new LinkedNode(x);
            tail = head;
            size++;
        }
        else {
            tail.next = new LinkedNode(x);
            tail = tail.next;
            size++;
        }
    }

    public int poll() {
        if (size == 0) {
            return 0;
        }
        int temp = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return temp;
    }

    public static void main(String[] args) {
        ModelQueue7 queue = new ModelQueue7();
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.poll());
        queue.clear();
        System.out.println(queue.getSize2());
    }
}




