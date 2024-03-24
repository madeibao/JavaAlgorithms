package com.basicJava8.www;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName LambdaTest
 * @Author：Mayuan
 * @Date 2020/6/18 10:34
 * @Description TODO
 * @Version 1.0
 * <p>
 * 基本的lambda表达式的计算。
 **/
public class LambdaTest {

    public static void main(String[] args) {
        Arrays.asList("a", "b", "c", "d", "e").forEach(e -> System.out.print(e + " "));
        String[] str2 = {"a", "aab", "aac", "aaa"};
        // Arrays.asList(str2).sort( (e1, e2 ) -> e1.compareTo( e2 ) );
        Arrays.asList(str2).sort(Comparator.naturalOrder());
        System.out.println();
        for (String temp : str2) {
            System.out.println(temp);
        }
    }
}
