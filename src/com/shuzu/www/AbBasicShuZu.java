package com.shuzu.www;

import java.util.Arrays;

/**
 * @program: Pro1->AbBasicShuZu
 * @description: 数组的基本的表示形式
 * @author: MaYuan
 * @create: 2019-12-23 13:37
 * @version: 1.0
 * 数组的基本设置情况。
 **/

public class AbBasicShuZu {
    public static void main(String[] args) {
        int[][] island = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},};
        //3   代表的是矩阵的行数
        System.out.println(island.length);
        //4  代表的是矩阵的列数
        System.out.println(island[0].length);

        Integer[] nums = {1, 2, 3, 45,};
        Arrays.asList(nums).stream().forEach(System.out::println);

        int[] num2 = {1, 2, 3, 4, 6};
        System.out.println(Arrays.toString(num2));
    }
}
