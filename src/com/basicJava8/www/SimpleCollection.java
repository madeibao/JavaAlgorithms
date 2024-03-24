package com.basicJava8.www;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName SimpleCollection
 * @Author：Mayuan
 * @Date 2020/3/12 22:14
 * @Description TODO
 * @Version 1.0
 * <p>
 * 集合的简单的实例应用
 * 这是向上转型的基本的应用案例。
 **/
public class SimpleCollection {

    public static void main(String[] args) {

        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }


        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}
