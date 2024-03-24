package com.queue.www;

/**
 * @program: Pro1->LinkedBlockQueue2
 * @description: 基本的带有阻塞队列的形式
 * @author: MaYuan
 * @create: 2019-12-23 19:54
 * @version: 1.0
 * *
 * * 由于LinkedBlockingQueue实现是程安全的，实现了先进先出等特性，
 * * 是作为生产者消费者的首选，LinkedBlockingQueue 可以指定容量，也可以不指定，不指定的话，
 * * 默认最大是Integer.MAX_VALUE，
 * * 其中主要用到put和take方法，put方法在队列满的时候会阻塞直到有队列成员被消费，take方法在队列空的时候会阻塞，直到有队列成员被放进来。
 * <p>
 * LinkedBlockingQueue是一个基于已链接节点的，范围任意的blocking queue
 * 此队列按FIFO（先进先出）排序元素
 * 新元素插入到队列的尾部，并且队列获取操作会获得位于队列头部的元素
 * 链接队列的吞吐量通常要高于基于数组的对列（ArrayBlockingQueue）,但是在大多数并发应用程序中，其可预知的性能要低
 * 可选的容量范围构造方法参数作为防止队列过度扩展的一种方法，
 * 如果未指定容量，则等于Integer.MAX_VALUE，除非插入节点会使队列超出容量，否则每次插入后会动态地创建链接节点LinkedBlockingQueue的属性
 **/
public class LinkedBlockQueue2 {

}
