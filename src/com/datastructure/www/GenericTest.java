package com.datastructure.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GenericTest
 * @Author：Mayuan
 * @Date 2020/6/12 9:36
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * Java的泛型编程
 **/
public class GenericTest {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);

        // 重载运算符。
        System.out.println("---------------------------------------");
        getData2(age);
        getData2(number);
    }

    /**
     * 通过使用通配符的问题来解决。
     *
     * @param data
     */
    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }

    public static void getData2(List<? extends Number> data) {
        System.out.println("data: " + data.get(0));
    }
}
