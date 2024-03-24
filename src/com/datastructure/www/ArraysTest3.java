package com.datastructure.www;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ArraysTest3
 * @Author：Mayuan
 * @Date 2020/6/7 10:32
 * @Description TODO
 * @Version 1.0
 **/

public class ArraysTest3 {

    public static void main(String[] args) {
//        Integer[] nums={3,4,5};
//        List<Integer> arr = Arrays.asList(nums);
//        System.out.println(arr.size());

        // 下面的写法是错误的。
        // 必须是泛形的写法才有用。

//        通过这些代码可以看出 asList 返回的列表只不过是一个披着 list 的外衣，
//        它并没有 list 的基本特性（变长）。该 list 是一个长度不可变的列表，
//        传入参数的数组有多长，其返回的列表就只能是多长。所以：

        int[] ints = {1, 2, 3, 4, 5};
        List list = Arrays.asList(ints);
        System.out.println("list'size：" + list.size());
    }
}
