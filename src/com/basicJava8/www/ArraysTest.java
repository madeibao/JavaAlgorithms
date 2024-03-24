package com.basicJava8.www;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName ArraysTest
 * @Author：Mayuan
 * @Date 2020/7/3 15:32
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java8的新的属性的编写。
 **/
public class ArraysTest {
    public static void main(String[] args) {
        String[] testString = new String[]{"aa", "ab", "abc", "mn", "aadd", "bcdd", "mm"};

        // Java8之前的老旧的写法，更新内容如下所示：
        /**
         Arrays.sort(testString, new Comparator<String>() {
        @Override public int compare(String s1, String s2) {
        return s1.length()-s2.length();
        }
        });
         */

        /**
         * 上下是同一个道理。
         * 下面是更加新颖的写法。
         */
        Arrays.sort(testString, (s1, s2) -> (s1.length() - s2.length()));
        Arrays.sort(testString, Comparator.comparingInt(String::length));

        for (String s : testString) {
            System.out.println(s + " ");
        }
    }
}
