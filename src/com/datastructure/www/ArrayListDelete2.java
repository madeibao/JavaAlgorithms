package com.datastructure.www;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName ArrayListDelete2
 * @Author：Mayuan
 * @Date 2021/4/11/0011 20:29
 * @Description TODO
 * @Version 1.0
 *
 * 链表的删除操作
 * list比如如何删除一个元素。
 *
 **/
public class ArrayListDelete2 {

    public static void main(String[] args) {
        var list2 = new ArrayList<Integer>();
        list2.add(2);
        list2.add(3);
        list2.add(4);

        // java删除元素的快速失败机制，fast-fail 删除一个元素。
        Iterator<Integer> ite = list2.iterator();
        while (ite.hasNext()) {
            Integer temp = ite.next();

            if(temp.equals(4)) {
                ite.remove();
            }
        }

        list2.forEach((e)-> System.out.println(e));
    }
}
