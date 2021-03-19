package com.datastructure.www;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



/**
 * @ClassName LinkedHashMapTest
 * @Author：Mayuan
 * @Date 2020/6/12 15:51
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 保证HashMap的插入和删除的有序性。
 * linkedHashMap直接的继承自HashMap
 * 注意linkedHashMap也是线程不安全的。
 * <p>
 * HashMap 加上双向链表来实现。
 **/
public class LinkedHashMapTest {

    public static void main(String[] args) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("name1", "josan1");
        linkedHashMap.put("name2", "josan2");
        linkedHashMap.put("name3", "josan3");
        // LinkedHashMap没有重写该方法，调用的HashMap中的entrySet方法
        Set<Entry<String, String>> set = linkedHashMap.entrySet();
        Iterator<Entry<String, String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println("key: " + key + ", value:" + value);
        }
    }
}
