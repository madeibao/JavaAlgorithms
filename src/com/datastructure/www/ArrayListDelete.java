package com.datastructure.www;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ArrayListDelete
 * @Author：Mayuan
 * @Date 2020/6/10 19:10
 * @Description TODO
 * @Version 1.0
 * 链表的删除的操作。
 * <p>
 * 链表的一边的遍历和一边删除。
 **/
public class ArrayListDelete {
    public static void main(String[] args) {
        List<String> platformList = new ArrayList<>();
        platformList.add("博客园");
        platformList.add("CSDN");
        platformList.add("掘金");

        Iterator<String> iterator = platformList.iterator();
        while (iterator.hasNext()) {
            String platform = iterator.next();
            if (platform.equals("博客园")) {
                iterator.remove();
            }
        }
        System.out.println(platformList);
    }


}
