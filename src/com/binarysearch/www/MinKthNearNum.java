package com.binarysearch.www;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 最接近的k个元素
 *
 * @ClassName MinKthNearNum
 * @Author：Mayuan
 * @Date 2024/9/28/星期六 22:49
 * @Description TODO
 * @Version 1.0
 **/
public class MinKthNearNum {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> res = new ArrayList<Integer>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            res.add(arr[i]);
        }

        Collections.sort(res, (a, b) -> {
            if (Math.abs(a - x) != Math.abs(b - x)) {
                return Math.abs(a - x) - Math.abs(b - x);
            }
            return a - b;
        });
        List<Integer> result = res.subList(0, k);
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        int x = 3;
        System.out.println(new MinKthNearNum().findClosestElements(nums, k, x));
    }
}
