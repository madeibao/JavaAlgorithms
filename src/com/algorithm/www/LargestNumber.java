package com.algorithm.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName LargestNumber
 * @Author：Mayuan
 * @Date 2020/2/22 16:46
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个数组的各个内容来组成一个最大的数字。
 **/
public class LargestNumber {

    public static String largestNumber(int[] nums) {
        List<String> list = new ArrayList<String>();
        Arrays.stream(nums).forEach(e -> list.add(String.valueOf(e)));
        list.sort((o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        StringBuilder res = new StringBuilder();
        list.stream().forEach(s -> res.append(s));
        if (res.toString().indexOf('0') == 0) {
            return "0";
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 24};
        System.out.println(largestNumber(nums));
    }
}
