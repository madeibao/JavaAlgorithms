package com.string.www;

/**
 * @program: JavaWorkSpace2->StringValueOf2
 * @description: 字符串的取值方法
 * @author: MaYuan
 * @create: 2020-01-29 17:36
 * @version: 1.0
 * 字符数组的形式来转化成字符串的形式。
 **/
public class StringValueOf2 {

    public static void main(String[] args) {
        char[] ch = {'1', '2', '3'};
        String str = String.valueOf(ch);

        // 判断是否为字符串的内容。
        System.out.println(str instanceof String);
        System.out.println(str);
    }
}
