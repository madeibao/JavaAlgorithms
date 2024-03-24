package com.shuzu.www;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName MinNumber
 * @Author：Mayuan
 * @Date 2020/9/10 16:49
 * @Description TODO
 * @Version 1.0
 **/
public class MinNumber {
    public static String PrintMinNumber(int[] numbers) {
        if(numbers == null || numbers.length == 0) {
            return "";
        }
        int n = numbers.length;
        String[] nums = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(nums, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));
        String ret = "";
        for (String str : nums) {
            ret += str;
        }
        return ret;
    }

    /**
     * 方法2的值。
     *
     * @param args
     */

    public static String PrintMinNumber2(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return "";
        }
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strNumbers.length; i++) {
            sb.append(strNumbers[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] res = {10, 2};
        System.out.println(PrintMinNumber(res));
    }
}

