package com.shuzu.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ThreeArrayIntersection
 * @Author：Mayuan
 * @Date 2020/3/29 17:56
 * @Description TODO
 * @Version 1.0
 * <p>
 * 三个有序数组的交集Java来实现
 * 输入: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
 * 输出: [1,5]
 * 解释: 只有 1 和 5 同时在这三个数组中出现.
 **/
public class ThreeArrayIntersection {
    public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        // 每个数字出现的次数
        int[] arr = new int[2001];
        for (int i : arr1) {
            ++arr[i];
        }
        for (int i : arr2) {
            ++arr[i];
        }
        for (int i : arr3) {
            ++arr[i];
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < 2001; ++i) {

            // 刚好三次
            if (arr[i] == 3) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {1, 2, 5, 7, 9};
        int[] num3 = {1, 3, 4, 5, 8};

        List<Integer> res = arraysIntersection(num1, num2, num3);
        res.forEach(System.out::println);
    }
}
