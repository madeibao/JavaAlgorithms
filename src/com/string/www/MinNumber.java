package com.string.www;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName MinNumber
 * @Author：Mayuan
 * @Date 2020/5/2 18:14
 * @Description TODO
 * @Version 1.0
 * <p>
 * 来组成最小的数字的结果值。
 * [10, 2]
 * 102
 **/
public class MinNumber {
    public static String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "";
        }
        int len = numbers.length;
        String[] str = new String[len];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String c1 = s1 + s2;
                String c2 = s2 + s1;
                return c1.compareTo(c2);
            }
        });
        for (int i = 0; i < len; i++) {
            sb.append(str[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {23, 21, 23, 41, 1, 12};
        System.out.println(PrintMinNumber(nums));
    }
}
