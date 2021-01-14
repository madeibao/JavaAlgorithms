package com.string.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ClassName StringCombination
 * @Author：Mayuan
 * @Date 2020/5/31 21:14
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的组合算法
 * 题目描述
 * 输入一个字符串，输出该字符串中相邻字符的所有组合。
 * 举个例子，如果输入abc，它的组合有a、b、c、ab、bc、abc。（注意：输出的组合需要去重）（40分）
 * 输入描述:
 * 一个字符串
 * 输出描述:
 * 一行，每个组合以空格分隔，相同长度的组合需要以字典序排序，且去重。
 * 示例1
 * 输入
 * 复制
 * bac
 * 输出
 * 复制
 * a b c ac ba bac
 **/
public class StringCombination {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                if (!list.contains(str)) {
                    list.add(str);
                }
            }
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    for (int i = 0; i < o1.length(); i++) {
                        if (o1.charAt(i) == o2.charAt(i)) {
                            continue;
                        }
                        return o1.charAt(i) - o2.charAt(i);
                    }
                }
                // 然后根据的字符串的长度值来进行排序。
                return o1.length() - o2.length();
            }
        });
        for (String sub : list) {
            System.out.print(sub + " ");
        }
    }
}
