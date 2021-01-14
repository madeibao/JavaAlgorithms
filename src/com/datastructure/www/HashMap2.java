package com.datastructure.www;

/**
 * @program: Pro1->HashMap2
 * @description: 哈希表的另一个用法内容
 * @author: MaYuan
 * @create: 2019-12-23 18:26
 * @version: 1.0
 * hashmap的基本的用法内容。
 **/

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap2 {
    public static void main(String[] args) {

        HashMap<String, String> hm1 = new HashMap<String, String>(3);
        HashMap<String, String> hm2 = new HashMap<String, String>(3);

        String[] key = {"name", "age", "tender"};
        String[] value = {"zhangsan", "16", "men"};
        hm2.put("id", "012");
        hm2.put("describe", "zhangdelaohaokanle");
        for (int i = 0; i < 3; i++) {
            hm1.put(key[i], value[i]);
        }
        //内容整个的追加进去。
        hm1.putAll(hm2);

        //get(Object key)根据key获取指定的value 通过key值来获取value的值。
        //获得的value值 为 zhangsan
        System.out.println(hm1.get("name"));

        //	containsKey(Object key)检测该映射中是否存在指定key的映射，有则返回true；没有则返回false
        //	containsValue(Object value)检测该映射中是否存在指定value的映射，有则返回true；没有则返回false

        //  返回的是布尔值。
        System.out.println(hm1.containsKey("id") + "    " + hm1.containsValue("013"));
        //remove(Object key)根据key的值删除指定的映射关系
        System.out.println(hm1.remove("describe"));
        //  values()返回值的集合，

        Collection<String> li = hm1.values();
        for (String string : li) {
            System.out.print(string + "     ");
        }

        //   entrySet()将此映射所包含的映射关系返回到Set中，通过Iterator迭代器迭代输出，或者用foreach输出
        for (Entry<String, String> me : hm1.entrySet()) {
            System.out.println(me.getKey() + ":" + me.getValue());
        }

        Set<Entry<String, String>> se = hm1.entrySet();
        Iterator<Entry<String, String>> it = se.iterator();
        while (it.hasNext()) {
            Entry<String, String> me = it.next();
            System.out.println(me.getKey() + ":" + me.getValue());
        }
    }
}
