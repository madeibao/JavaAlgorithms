package com.string.www;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName StringRegexNum
 * @Author：Mayuan
 * @Date 2020/6/28 20:49
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java的字符串中匹配所有的整数。
 **/
public class StringRegexNum {
    public static String getNumbers(String content) {
        String str = "-?\\d+";
        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(content);
        ArrayList<String> arr = new ArrayList<>();

        while (matcher.find()) {
            arr.add(matcher.group());
        }
        arr.forEach(System.out::println);
        return "";
    }

    public static void main(String[] args) {

        String str = "10  aa-5 013我24a 5c6";
        System.out.println(getNumbers(str));

    }
}
