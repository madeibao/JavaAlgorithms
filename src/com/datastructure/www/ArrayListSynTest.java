package com.datastructure.www;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName ArrayListSynTest
 * @Author：Mayuan
 * @Date 2020/10/19 10:16
 * @Description TODO
 * @Version 1.0
 * <p>
 * 线程安全的ArrayList内容
 * 线程安全的是实现
 **/
public class ArrayListSynTest {
    public static void main(String[] args) {
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
        synchronizedList.add("aaa");
        synchronizedList.add("bbb");

        for (int i = 0; i < synchronizedList.size(); i++) {
            System.out.println(synchronizedList.get(i));
        }
    }
}
