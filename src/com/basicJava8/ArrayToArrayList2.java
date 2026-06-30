package com.basicJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ArrayToArrayList2
 * @Author：Mayuan
 * @Date 2020/2/25 22:22
 * @Description TODO
 * @Version 1.0
 * 数组变成链表的形式来进行存储。
 **/
public class ArrayToArrayList2 {

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4};
        ArrayList<Integer> res = new ArrayList<Integer>(Arrays.asList(nums));
        res.forEach(System.out::println);

        System.out.println("-----------------");

        int[] num2 = {1, 2, 3, 4, 5};
        ArrayList<Integer> res2 = new ArrayList<>();
        for (int k : num2) {
            res2.add(k);
        }

        res2.forEach(System.out::println);

        int[] num3 = new int[]{1, 2, 3, 3};
        List<Integer> list = Arrays.stream(num3).boxed().toList();
        System.out.println("---------------------");
        for (int j : list) {
            System.out.print(j + " ");
        }
    }
}




