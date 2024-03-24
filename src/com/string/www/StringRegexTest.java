package com.string.www;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName StringRegexTest
 * @Author：Mayuan
 * @Date 2020/7/4 16:10
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java的正则表达式方法介绍。
 **/

public class StringRegexTest {
    private static String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoobkkk";
    private static String REPLACE = "-";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        // 获取 matcher 对象
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        // 只要是找到后面的值，都进行追加到末尾的位置。
        while (m.find()) {
            m.appendReplacement(sb, REPLACE);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}