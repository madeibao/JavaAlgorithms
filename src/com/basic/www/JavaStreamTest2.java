package com.basic.www;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName JavaStreamTest2
 * @Author：Mayuan
 * @Date 2020/6/14 10:11
 * @Description TODO
 * @Version 1.0
 * <p>
 * java流的转换2
 **/
public class JavaStreamTest2 {

    public static void main(String[] args) {

        // 转换方法。
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.forEach(System.out::println);

        //整形和包装形的相互的转换。
        Integer[] integer = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        for (Integer j : integer) {
            System.out.print(j + " ");
        }

        // 第三种转换。
        Integer[] res2 = {23, 23, 241, 1, 12, 2, 2};
        int[] arr2 = Arrays.stream(res2).mapToInt(Integer::valueOf).toArray();

        // 第四种转换。

        Integer[] res3 = {23, 23, 241, 1, 12, 2, 2};
        List<Integer> list3 = Arrays.asList(res3);

        // 第五种
        /**
         三、List< Integer >
         3.1、List< Integer > 转 Integer[ ]
         Integer[] integers = list.toArray(new Integer[list.size()]);


         3.2、List< Integer > 转 int[ ]
         int[] arr2 = list.stream().mapToInt(Integer::valueOf).toArray();

         */
    }
}
