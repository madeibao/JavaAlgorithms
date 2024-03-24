package com.string.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName StringSort
 * @Author：Mayuan
 * @Date 2020/2/18 21:04
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一种特殊的字符串的排序内容。
 * 编写一个程序，将输入字符串中的字符按如下规则排序。
 * <p>
 * 规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。
 * <p>
 * 如，输入： Type 输出： epTy
 * <p>
 * 规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。
 * <p>
 * 如，输入： BabA 输出： aABb
 * <p>
 * 规则 3 ：非英文字母的其它字符保持原来的位置。
 * <p>
 * 如，输入： By?e 输出： Be?y
 * <p>
 * 实例：
 * A Famous Saying: Much Ado About Nothing (2012/8).
 * 输出结果：
 * A aaAAbc dFgghh: iimM nNn oooos Sttuuuy (2012/8).
 **/
public class StringSort {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while ((str = bf.readLine()) != null) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 26; i++) {
                char c = (char) (i + 'A');
                for (int j = 0; j < str.length(); j++) {
                    char sc = str.charAt(j);

                    // 如果就是字符的本身或者是其小写等形式。
                    if (c == sc || c == sc - 32) {
                        sb.append(sc);
                    }
                }
            }

            // 如果是其他的字符，那么直接的对应的位置进行插入。
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if ((!(c >= 'a' && c <= 'z')) && (!(c >= 'A' && c <= 'Z'))) {
                    sb.insert(i, c);
                }
            }
            System.out.println(sb.toString());
        }
        bf.close();
    }
}



