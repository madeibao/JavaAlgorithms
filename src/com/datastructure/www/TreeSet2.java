package com.datastructure.www;

import java.util.TreeSet;

/**
 * @ClassName TreeSet2
 * @Author：Mayuan
 * @Date 2020/3/9 11:15
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java的TreeSet的调用
 **/
public class TreeSet2 {
    public static void main(String[] args) {

        // 创建集合对象
        // 自然顺序进行排序
        TreeSet<Integer> ts = new TreeSet<Integer>();

        // 创建元素并添加
        // 20,18,23,22,17,24,19,18,24
        ts.add(20);
        ts.add(18);
        ts.add(23);
        ts.add(22);
        ts.add(17);
        ts.add(24);
        ts.add(19);

        // 遍历
        for (Integer i : ts) {
            System.out.println(i);
        }
    }
}
