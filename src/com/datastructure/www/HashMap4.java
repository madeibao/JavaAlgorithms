package com.datastructure.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: JavaWorkSpace2->HashMap4
 * @description: 哈希表的使用方法
 * @author: MaYuan
 * @create: 2020-02-11 16:07
 * @version: 1.0
 * put与putIfAbsent区别:
 * <p>
 * put在放入数据时，如果放入数据的key已经存在与Map中，最后放入的数据会覆盖之前存在的数据，
 * <p>
 * 而putIfAbsent在放入数据时，如果存在重复的key，那么putIfAbsent不会放入值。
 * putIfAbsent   如果传入key对应的value已经存在，就返回存在的value，不进行替换。如果不存在，就添加key和value，返回null
 **/
public class HashMap4 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ZhangSan");
        map.put(2, "LiSi");
        map.forEach((key, value) -> {
            System.out.println("key : " + key + " , value : " + value);
        });
    }
}

