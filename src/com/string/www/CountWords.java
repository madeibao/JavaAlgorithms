package com.string.www;

/**
 * @ClassName CountWords
 * @Author：Mayuan
 * @Date 2020/3/21 22:23
 * @Description TODO
 * @Version 1.0
 * <p>
 * 用来统计单词的数量
 **/
public class CountWords {
    public static int countSegments(String s) {
        String[] arr = s.split(" ");
        int len = 0;
        for (String t : arr) {
            if (t.equals(" ") || t.isEmpty()) {
                continue;
            }
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        // 统计得出的单词的结果为5.
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));

    }
}
