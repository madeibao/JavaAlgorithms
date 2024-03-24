package com.queue.www;

/**
 * @program: JavaWorkSpace2->DequeTest
 * @description: 双向队列内容
 * @author: MaYuan
 * @create: 2020-01-11 20:52
 * @version: 1.0
 * <p>
 * 插入、删除、获取操作支持两种形式：快速失败和返回null或true/false
 * 既具有FIFO特点又具有LIFO特点，即是队列又是栈
 * 不推荐插入null元素，null作为特定返回值表示队列为空
 * 未定义基于元素相等的equals和hashCode
 * <p>
 * 接口分析
 * 双向队列操作
 * 插入元素
 * addFirst(): 向队头插入元素，如果元素为空，则发生NPE
 * addLast(): 向队尾插入元素，如果为空，则发生NPE
 * offerFirst(): 向队头插入元素，如果插入成功返回true，否则返回false
 * offerLast(): 向队尾插入元素，如果插入成功返回true，否则返回false
 * 移除元素
 * removeFirst(): 返回并移除队头元素，如果该元素是null，则发生NoSuchElementException
 * removeLast(): 返回并移除队尾元素，如果该元素是null，则发生NoSuchElementException
 * pollFirst(): 返回并移除队头元素，如果队列无元素，则返回null
 * pollLast(): 返回并移除队尾元素，如果队列无元素，则返回null
 * 获取元素
 * getFirst(): 获取队头元素但不移除，如果队列无元素，则发生NoSuchElementException
 * getLast(): 获取队尾元素但不移除，如果队列无元素，则发生NoSuchElementException
 * peekFirst(): 获取队头元素但不移除，如果队列无元素，则返回null
 * peekLast(): 获取队尾元素但不移除，如果队列无元素，则返回null
 * 栈操作
 * pop(): 弹出栈中元素，也就是返回并移除队头元素，等价于removeFirst()，如果队列无元素，则发生NoSuchElementException
 * push(): 向栈中压入元素，也就是向队头增加元素，等价于addFirst()，如果元素为null，则发生NPE，如果栈空间受到限制，则发生IllegalStateException
 * 应用场景
 * 满足FIFO场景时
 * 满足LIFO场景时，曾经在解析XML按标签时使用过栈这种数据结构，但是却选择Stack类，如果在进行栈选型时，更推荐使用Deque类，应为Stack是线程同步
 * 主要实现
 * ArrayDeque: 基于数组实现的线性双向队列
 * LinkedList: 基于链表实现的链式双向队列
 **/


import java.util.Deque;
import java.util.LinkedList;


public class DequeTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Deque<String> deque = new LinkedList<String>();
        deque.add("d");
        deque.add("e");
        deque.add("f");

        //从队首取出元素，不会删除
        System.out.println("队首取出元素:" + deque.peek());
        System.out.println("队列为:" + deque);

        //从队首加入元素(队列有容量限制时用，无则用addFirst)
        deque.offerFirst("c");
        System.out.println("队首加入元素后为：" + deque);
        //从队尾加入元素(队列有容量限制时用，无则用addLast)
        deque.offerLast("g");
        System.out.println("队尾加入元素后为：" + deque);

        //队尾加入元素
        deque.offer("h");
        System.out.println("队尾加入元素后为：" + deque);

        //获取并移除队列第一个元素,pollFirst()也是，区别在于队列为空时,removeFirst会抛出NoSuchElementException异常，后者返回null
        deque.removeFirst();
        System.out.println("获取并移除队列第一个元素后为:" + deque);

        //获取并移除队列第一个元素,此方法与pollLast 唯一区别在于队列为空时,removeLast会抛出NoSuchElementException异常，后者返回null
        deque.removeLast();
        System.out.println("获取并移除队列最后一个元素后为:" + deque);

        //获取队列第一个元素.此方法与 peekFirst 唯一的不同在于：如果此双端队列为空，它将抛出NoSuchElementException，后者返回null
        System.out.println("获取队列第一个元素为:" + deque.getFirst());
        System.out.println("获取队列第一个元素后为:" + deque);

        //获取队列最后一个元素.此方法与 peekLast 唯一的不同在于：如果此双端队列为空，它将抛出NoSuchElementException，后者返回null
        System.out.println("获取队列最后一个元素为:" + deque.getLast());
        System.out.println("获取队列第一个元素后为:" + deque);

        //循环获取元素并在队列移除元素
        while (deque.size() > 0) {
            System.out.println("获取元素为：" + deque.pop() + " 并删除");
        }
        System.out.println("队列为:" + deque);
    }

}