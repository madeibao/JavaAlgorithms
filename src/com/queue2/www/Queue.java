package com.queue2.www;

/**
 * @ClassName Queue
 * @Author：Mayuan
 * @Date 2021/9/21/0021 18:04
 * @Description TODO
 * @Version 1.0
 **/

public interface Queue<E> {
    /**
     *     获取队列中元素个数
     */

    int getSize();

    //*队列中元素是否为空*/

    boolean isEmpty();

    /**
     * 入队列
     * @param e
     */
    void enqueue(E e);

    /**
     * 出队列
     * @return
     */
    public E dequeue();

    /**
     * 获取队首元素
     * @return
     */
    public E getFront();
}