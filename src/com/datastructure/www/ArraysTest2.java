package com.datastructure.www;

import java.util.Arrays;

/**
 * @ClassName ArraysTest2
 * @Author：Mayuan
 * @Date 2020/2/18 15:43
 * @Description TODO
 * @Version 1.0
 **/
public class ArraysTest2 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9};
        int[] copyArr;
        copyArr = Arrays.copyOfRange(arr, 3, 9);
        System.out.println(Arrays.toString(copyArr));
    }
}
