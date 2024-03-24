package com.algorithm.www;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: JavaWorkSpace2->NumberAppearOnce3
 * @description: 出现三次的数字内容
 * @author: MaYuan
 * @create: 2020-01-16 21:32
 * @version: 1.0
 **/
public class NumberAppearOnce3 {
    public static void findNumsAppearOnce(int[] array, int num1[], int num2[]) {
        //先排序，再奇偶121212拆散，其中相同的一组数字必定分离
        Arrays.sort(array);
        //按性质，绝不可能发生这两个数被放置在了同一子数组，必有有一奇一偶。
        //要找的两个数中小的不肯出现在偶数列，大的不可能出现在基数列末尾
        //用于存放找到的值
        ArrayList<Integer> list = new ArrayList<>();
        int flag = 0;
        //两个指示标志向后搜索

        //如果哪个小，即找到一个，存起来，大的那个指示向后退两步
        for (int i = 0, j = 1; i < array.length - 1; i = i + 2, j = j + 2) {
            if (array[i] != array[j]) {
                if (array[i] < array[j]) {
                    list.add(array[i]);
                    j = j - 2;
                }//i所指小则写出该数
                else {
                    list.add(array[j]);
                    i = i - 2;
                }
            }
        }
        //如果找到最后list仍然没有两个数，那么偶数数组最后一个值为单独最大值，即要找的第二个数
        if (list.size() < 2) {
            list.add(array[array.length - 1]);
        }
        num1[0] = list.get(0);
        num2[0] = list.get(1);
        System.out.print(num1[0]);
        System.out.println();
        System.out.print(num2[0]);
    }

    public static void main(String[] args) {
        int[] array = {4, 6, 1, 1, 1, 1};
        int[] num1 = new int[1];
        int[] num2 = new int[1];

        findNumsAppearOnce(array, num1, num2);
    }
}
