package com.algorithm.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: JavaWorkSpace2->ThreeArrayInterAction
 * @description: 三个有序的数组的交集
 * @author: MaYuan
 * @create: 2020-02-10 17:25
 * @version: 1.0
 **/
public class ThreeArrayInterAction {
    public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> res = new ArrayList<>();
        if (arr1 == null || arr2 == null || arr3 == null) {
            return res;
        }

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr1[i] == arr3[k]) {
                res.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {1, 2, 5, 7, 9};
        int[] num3 = {1, 3, 4, 5, 8};

        List<Integer> res = arraysIntersection(num1, num2, num3);
        System.out.println(res.toString());
    }
}



