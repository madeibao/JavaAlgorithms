package com.datastructure.www;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @ClassName ArrayListTraverse2
 * @Author：Mayuan
 * @Date 2020/3/12 22:35
 * @Description TODO
 * @Version 1.0
 * <p>
 * 链表的遍历第二种方式。
 **/
public class ArrayListTraverse2 {
    public static void main(String[] args) {

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("aaa");
        list2.add("bbb");
        list2.add("ccc");
        System.out.println("Before iterate : " + list2);

        ListIterator<String> ite = list2.listIterator();
        while (ite.hasNext()) {
            System.out.println(ite.next() + ", " + ite.previousIndex() + ", " + ite.nextIndex());
        }

        while (ite.hasPrevious()) {
            System.out.print(ite.previous() + "  ");
        }

        System.out.println();
        // 从第一个位置的内容开始遍历
        ite = list2.listIterator(1);
        while (ite.hasNext()) {
            String t = ite.next();
            System.out.println(t);
            if ("ccc".equals(t)) {
                ite.set("nnn");
            } else {
                ite.add("kkk");
            }
        }
        System.out.println("after the iterterator " + list2);
    }
}




