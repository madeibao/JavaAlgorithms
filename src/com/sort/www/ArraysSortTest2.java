package com.sort.www;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName ArraysSortTest2
 * @Author：Mayuan
 * @Date 2020/5/9 22:14
 * @Description TODO
 * @Version 1.0
 **/
public class ArraysSortTest2 {
    public static void main(String[] args) {
        // 注意，要想改变默认的排列顺序，不能使用基本类型（int,double, char）
        // 而要使用它们对应的类
        Integer[] a = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};
        // 定义一个自定义类MyComparator的对象
        Comparator cmp = new MyComparator();
        Arrays.sort(a, cmp);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

// Comparator是一个接口
//Comparator是一个比较器
//Comparator中的compare可以将传入进行比对，按照返回的参数大于(1)等于(0)小于(-1)进行排序
//默认情况下返回1的在后，返回-1的在前
//如果我们需要逆序，只要把返回值-1和1的换位置即可。
class MyComparator implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        // 如果o1小于o2，我们就返回正值，如果n1大于n2我们就返回负值，
        if (o1 < o2) {
            return 1;
        } else if (o1 > o2) {
            return -1;
        } else {
            return 0;
        }
    }
}