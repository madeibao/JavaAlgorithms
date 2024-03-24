package com.basic.www;

import javafx.util.Pair;

/**
 * @program: JavaWorkSpace2->PairFunction
 * @description: Java的配对的使用
 * @author: MaYuan
 * @create: 2020-02-12 22:04
 * @version: 1.0
 * <p>
 * 配对的东西都需要我们来使用，所以，使用Java的配对内容。
 * 实际上Pair保存的应该说是一个信息对，两个信息都是我们需要的，没有key和value之分。
 **/
public class PairFunction {
    public static void main(String[] args) {
        Pair<String, String> pair = new Pair<>("aku", "female");
        String key = pair.getKey();
        String value = pair.getValue();
        System.out.println(key);
        System.out.println(value);
    }
}
