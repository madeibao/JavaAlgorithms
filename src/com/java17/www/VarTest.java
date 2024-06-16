package com.java17.www;

/**
 * @ClassName VarTest
 * @Author：Mayuan
 * @Date 2024/6/2/星期日 11:41
 * @Description TODO
 * @Version 1.0
 **/

import java.util.List;
import java.util.ArrayList;

public class VarTest {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
