package com.datastructure.www;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: Pro1->HashSet2
 * @description: 哈希集合
 * @author: MaYuan
 * @create: 2019-12-23 18:45
 * @version: 1.0
 * 哈希表的基本的用法内容。
 **/
public class HashSet2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>(10);
        set.add("java");
        set.add("js");
        set.add("sql");
        set.add("java");
        set.add("js");
        set.add("jquery");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
