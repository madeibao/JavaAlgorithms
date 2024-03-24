package com.datastructure.www;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.function.Consumer;

/**
 * @ClassName VectorTest
 * @Author：Mayuan
 * @Date 2020/3/9 10:28
 * @Description TODO
 * @Version 1.0
 * <p>
 * 否：List
 * <p>
 * 要安全吗?
 * <p>
 * 是：Vector
 * 否：ArrayList或者LinkedList
 * <p>
 * 查询多：ArrayList
 * 增删多：LinkedList
 * 如果你知道是List，但是不知道是哪个List，就用ArrayList。
 * <p>
 * vector是线程安全的
 * <p>
 * 1）线程安全：
 * <p>
 * 从上面的构造方法还有增删改查的操作其实我们都发现了，都有这么一个synchronized关键字，
 * 就是这个关键字为Vector容器提供了一个安全机制，保证了线程安全。
 * vector是一个遗留的类。
 **/

public class VectorTest {

    public static void main(String[] args) {
        Vector<String> t = new Vector<String>();

        t.add("H");
        t.add("E");
        t.add("L");
        t.add("L");
        t.add("O");


        // 第一种遍历

        for (String str : t) {
            System.out.println(str);

        }
        System.out.println("--------------------------------");
        //第二种遍历
        t.forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }

        });
        System.out.println("--------------------------------");
        // 第三种遍历方式
        for (int i = 0; i < t.size(); i++) {
            System.out.println(t.get(i));

        }

        System.out.println("--------------------------------");
        // 第四种⏲遍历方式
        Iterator<String> it = t.iterator();

        while (it.hasNext()) {

            String str = (String) it.next();
            System.err.println(str);
        }

        System.out.println("--------------------------------");
        // 第五种遍历方式
        Enumeration<String> ee = t.elements();
        while (ee.hasMoreElements()) {
            System.err.println(ee.nextElement().toString());
        }
    }
}