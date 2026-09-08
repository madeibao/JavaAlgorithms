package com.Stream.www;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @ClassName ArraysTest
 * @Author Mayuan
 * @Date 2026/9/8/星期二 17:06
 * @Version 1.0
 **/
public class ArraysTest {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Apple", "HuaWei", "OPPO", "VIVO");
        String[] res = new String[strs.size()];
        Arrays.setAll(res, i -> strs.get(i).toUpperCase() + " Phone");

        for (var j : res) {
            System.out.println(j);
        }
    }
}

