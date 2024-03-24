package com.myutil.www;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: Pro1->ArraysSort
 * @description: 内部自定义排序
 * @author: MaYuan
 * @create: 2019-12-23 19:46
 * @version: 1.0
 **/
public class ArraysSort {
    public static void main(String[] args) {
        int[] num = {1, 3, 8, 5, 2, 4, 6, 7};
        Integer[] num2 = {23, 3, 3, 4, 1, 43, 5, 6, 8, 89, 2, 3, 5, 65,};
        //sort 内部采用的是双轴快速排序。
        Arrays.sort(num);
        for (int i : num) {
            //这里是顺序的排序。
            System.out.print(i + " ");
        }
        System.out.println();
        Comparator<Integer> c = new Mycomparator1();
        Arrays.sort(num2, c);
        for (Integer i1 : num2) {
            System.out.print(i1 + " ");
        }
    }
}

class Mycomparator1 implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // 默认是o1 < o2时返回-1， 一下同理
        if (o1 > o2) {
            return -1;
        }
        if (o1 < o2) {
            return 1;
        }
        return 0;
    }
}


