package com.myutil.www;

/**
 * @program: Pro1->ArraysToString2
 * @description: 转化为数组易于人类阅读
 * @author: MaYuan
 * @create: 2019-12-23 19:50
 * @version: 1.0
 **/

import java.util.Arrays;

public class ArraysToString2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        //数组名代表的是一个地址，对象。
        System.out.println(a);
        System.out.println(Arrays.toString(a));
    }
}

//[I@512ddf17
////[1, 2, 3]
//
//// 2019.12.23
////[I@5fd0d5ae]
//// [1, 2, 3]