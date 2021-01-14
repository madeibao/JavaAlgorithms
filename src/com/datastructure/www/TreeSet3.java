package com.datastructure.www;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @ClassName TreeSet3
 * @Author：Mayuan
 * @Date 2020/6/1 21:54
 * @Description TODO
 * @Version 1.0
 **/
public class TreeSet3 {
    public static void main(String[] args) {
        // 集合具有具有唯一性。
        // 表示长度值的字符串具有唯一性。
        TreeSet<String> set2 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.length() - t1.length();
            }
        });

        set2.add("b");
        set2.add("m");
        set2.add("sa");
        set2.add("ss");
        set2.add("mmm");
        for (Iterator it = set2.iterator(); it.hasNext(); ) {
            System.out.print(it.next() + " ");
        }
    }
}
