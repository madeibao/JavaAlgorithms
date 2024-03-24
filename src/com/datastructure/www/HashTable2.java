package com.datastructure.www;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @program: JavaWorkSpace2->HashTable2
 * @description: 哈希表
 * @author: MaYuan
 * @create: 2020-01-16 21:15
 * @version: 1.0
 * <p>
 * 2、遍历HashMap 时使用 Iterator 。
 * 3、HashMap在遍历时，并不是按照添加的前后顺序输出的！
 * 线程不安全。替代品CurrentHashMap
 * 输出顺序到底是什么规律呢？
 * 4、Hashtable 与HashMap 在使用的”存取、遍历“等方法上几乎一致！！  其区别主要在于”线程同步“与否。
 **/
public class HashTable2 {
    public static void main(String[] args) {
        Map<Integer, String> table2 = new Hashtable<>();
        table2.put(1, "java");
        table2.put(2, "C++");
        table2.put(3, "python");

        Set<Entry<Integer, String>> set2 = table2.entrySet();
        for (Entry<Integer, String> s2 : set2) {
            System.out.println(s2);
        }
    }
}


