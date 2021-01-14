package com.datastructure.www;

import java.util.ArrayList;

/**
 * @ClassName ArrayList2ArrayTest2
 * @Author：Mayuan
 * @Date 2020/3/21 17:18
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java的链表类型变成数组的形式来进行存储
 **/
public class ArrayList2ArrayTest2 {

    public static void main(String[] args) {

        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        res.add(2);
        res.add(3);
        res.add(4);

        // 下面是第一种方法来进行转化。
        int[] nums = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            nums[i] = res.get(i);
        }

        // 第二种方法来进行转换，利用Java8的数据流来实现

        int[] arr1 = res.stream().mapToInt(Integer::valueOf).toArray();

        for (int j : arr1) {
            System.out.print(j + " ");
        }
    }
}
