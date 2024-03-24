package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->AlphaToInteger
 * @description: 解码字母到数字来进行映射的内容
 * @author: MaYuan
 * @create: 2020-02-09 15:42
 * @version: 1.0
 * <p>
 * 注意的是s.substring() 是小写的写法。
 **/
public class AlphaToInteger {
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                sb.append((char) ('a' - 1 + Integer.parseInt(s.substring(i, i + 2))));
                i += 3;
            } else {
                sb.append((char) ('a' - 1 + s.charAt(i) - '0'));
                i++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "1326#";
        System.out.println(freqAlphabets(s));
    }
}
