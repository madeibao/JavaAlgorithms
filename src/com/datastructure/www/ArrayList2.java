package com.datastructure.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Pro1->ArrayList2
 * @description: 链表文件
 * @author: MaYuan
 * @create: 2019-12-23 18:54
 * @version: 1.0
 * <p>
 * 因为 ArrayList 是基于数组实现的，所以支持快速随机访问。
 * RandomAccess 接口标识着该类支持快速随机访问。
 * 线程不安全。
 * <p>
 * 线程安全解决办法 ：
 * <p>
 * 方法1： Collections.synchronizedList(new LinkedList<String>())
 * <p>
 * 方法2:    LinkedList和ArrayList换成线程安全的集合，如CopyOnWriteArrayList，ConcurrentLinkedQueue......
 * <p>
 * 方法3：Vector(内部主要使用synchronized关键字实现同步)
 **/
public class ArrayList2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);
        list1.add(1);
        int size = list1.size();
        for (int i = 0; i < size; i++) {
            System.out.print(list1.get(i) + " ");
        }
    }
}







