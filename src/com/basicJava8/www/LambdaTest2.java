package com.basicJava8.www;

import java.util.*;

/**
 * @ClassName LambdaTest2
 * @Author：Mayuan
 * @Date 2021/4/11/0011 19:30
 * @Description TODO
 * @Version 1.0
 *
 * 表达式的计算。
 *
 **/
public class LambdaTest2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        /***
         *
         * 方法1
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });**/

        /**
         * 方法2
         *
         * Collections.sort(names, (String a,String b)-> {
         *          return a.compareTo(b);
         *  });
         **/

        /**
         * 方法3
         *
         * Collections.sort(names, (String a, String b) -> b.compareTo(a));
         */

        /**
         * 方法4
         */
        names.sort((a,b)->b.compareTo(a));
//        names.forEach(System.out::println);

        names.forEach((e)-> System.out.println(e));


    }
}
