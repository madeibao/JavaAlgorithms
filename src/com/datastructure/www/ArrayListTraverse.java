package com.datastructure.www;

import java.util.ArrayList;

/**
 * @ClassName ArrayList3
 * @Author：Mayuan
 * @Date 2020/2/22 16:59
 * @Description TODO
 * @Version 1.0
 **/
public class ArrayListTraverse {

    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>();

        res.add(1);
        res.add(3);
        res.add(4);
        res.add(5);
        res.add(2);
        res.add(6);

        // 第一种的遍历方式

//        for(Integer i:res) {
//            System.out.print(i+" ");
//        }
//
//        for(int i=0;i<res.size();i++) {
//            System.out.print(res.get(i)+" ");
//        }
//        // JDK 1.8 之后可以这么一个写法来实现。
//        res.forEach((Integer integer) -> {
//            System.out.println(integer);
//        });
        //-------------------------------------
//        res.forEach(integer -> {
//            System.out.println(integer);
//        });
        //---------------------------------------
//        res.forEach(integer -> System.out.println(integer));
        //————————————————————————————————————————————————

        res.forEach(System.out::println);
    }
}
