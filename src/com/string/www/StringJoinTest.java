package com.string.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StringJoinTest
 * @Author：Mayuan
 * @Date 2020/6/30 14:53
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的方法展示。
 **/
public class StringJoinTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mxy");
        list.add("String");
        list.add("join");
        //传入String类型的List集合，使用"-"号拼接
        String join = String.join("-", list);
        System.out.println(join);
        //传入String类型的数组，使用"-"号拼接
        String[] s = new String[]{"Yuan", "Mxy"};
        String join2 = String.join("-", s);
        System.out.println(join2);
    }
}
