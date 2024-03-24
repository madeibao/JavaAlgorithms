package com.basic.www;

import java.util.ArrayList;

/**
 * @ClassName VarTest
 * @Author：Mayuan
 * @Date 2020/6/16 16:09
 * @Description TODO
 * @Version 1.0
 * <p>
 * java的新增的关键字的测试文件。
 **/
public class VarTest {
    public static void main(String[] args) {
        var att = new ArrayList<String>();
        att.add("hello");
        att.add("world");
        att.add("Java");
        att.forEach(System.out::println);
    }
}
