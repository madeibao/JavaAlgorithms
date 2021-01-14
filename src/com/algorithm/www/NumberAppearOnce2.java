package com.algorithm.www;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @program: JavaWorkSpace2->NumberAppearOnce2
 * @description: 数组中只出现一次的元素内容
 * @author: MaYuan
 * @create: 2020-01-16 20:07
 * @version: 1.0
 **/
public class NumberAppearOnce2 {
    public static void findNumsAppearOnce(int[] array, int num1[], int num2[]) {

        if (array == null || array.length == 0) {
            return;
        }

        //新建hashMap，统计字数出现的次数
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        //存储字符出现一次的数
        int[] num = new int[2];
        //统计每个字符的次数
        for (int key : array) {
            if (hashMap.containsKey(key)) {
                hashMap.put(key, hashMap.get(key) + 1);
            } else {
                hashMap.put(key, 1);
            }
        }

        //遍历,如果出现次数为1，则将改数保存到数组num中
        int i = 0;
        Set<Map.Entry<Integer, Integer>> set = hashMap.entrySet();

        for (Map.Entry<Integer, Integer> s : set) {
            if (s.getValue() == 1) {
                num[i++] = s.getKey();
            }
        }

        //保存结果
        num1[0] = num[0];
        num2[0] = num[1];
    }

    public static void main(String[] args) {

        int[] array = {4, 6, 1, 1, 1, 1};
        int[] num1 = new int[1];
        int[] num2 = new int[1];

        findNumsAppearOnce(array, num1, num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }

}
