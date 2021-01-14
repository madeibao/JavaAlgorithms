package com.datastructure.www;

/**
 * @ClassName ConcurrentHashMapTest
 * @Author：Mayuan
 * @Date 2020/3/8 22:15
 * @Description TODO
 * @Version 1.0
 * <p>
 * ConcurrentHashMap是Java中的一个线程安全且高效的HashMap实现。平时涉及高并发如果要用map结构，那第一时间想到的就是它。
 * 那么我就这几个方面了解一下ConcurrentHashMap：
 * <p>
 * 1）ConcurrentHashMap在JDK8里结构
 * 2）ConcurrentHashMap的put方法、szie方法等
 * 3）ConcurrentHashMap的扩容
 * 4）HashMap、Hashtable、ConccurentHashMap三者的区别
 * 5）ConcurrentHashMap在JDK7和JDK8的区别
 * 那么它到底是如何实现线程安全的？
 * 答案:其中抛弃了原有的Segment 分段锁，而采用了 CAS + synchronized 来保证并发安全性。至于如何实现，那我继续看一下put方法逻辑
 * HashMap、Hashtable、ConccurentHashMap三者的区别
 * HashMap线程不安全，数组+链表+红黑树
 * Hashtable线程安全，锁住整个对象，数组+链表
 * ConccurentHashMap线程安全，CAS+同步锁，数组+链表+红黑树
 * HashMap的key，value均可为null，其他两个不行。
 **/


public class ConcurrentHashMapTest {

    public static void main(String[] args) {

    }
}
