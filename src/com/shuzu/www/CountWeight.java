package com.shuzu.www;

import java.util.Arrays;

/**
 * @program: JavaWorkSpace2->CountWeight
 * @description: 最多可以保持多少个苹果
 * @author: MaYuan
 * @create: 2020-02-12 14:45
 * @version: 1.0
 **/
public class CountWeight {

    private static int maxNumberApple(int[] apple) {
        // 首先来进行排序。
        Arrays.sort(apple);
        int length = apple.length;
        int sum = 0;
        int res = length;
        for (int i = 0; i < length; i++) {
            sum += apple[i];
            if (sum > 5000) {
                res = i;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {100, 200, 150, 1000};
        int res = maxNumberApple(arr);
        System.out.println(res);
    }
}
