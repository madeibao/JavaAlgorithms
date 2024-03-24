package com.Stream.www;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ListSumTest
 * @Author：Mayuan
 * @Date 2024/3/10/0010 18:19
 * @Description TODO
 * @Version 1.0
 **/
public class ListSumTest {

    public static void main(String[] args) {
        List<Integer> res = Arrays.asList(2,3,4,5,6,7,8,9);

        int sum2 = res.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum2);
    }
}
