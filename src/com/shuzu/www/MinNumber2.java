package com.shuzu.www;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @ClassName MinNumber2
 * @Author：Mayuan
 * @Date 2020/9/11 10:02
 * @Description TODO
 * @Version 1.0
 **/
public class MinNumber2 {

    public static String minNumber(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return "";
        }

        int n = nums.length;
        String[] value = new String[n];

        for (int i = 0; i < n; i++) {
            value[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(value, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(value[i]);
        }
        return sb.toString();
    }

    /**
     * 组成的最小的数字
     *
     * @param nums
     * @return
     */
    public static String minNumber2(int[] nums) {
        return Arrays.stream(nums).mapToObj(it -> it + "")
                .sorted((o1, o2) -> (o1 + o2).compareTo(o2 + o1))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        int[] nums = {10, 2};
        System.out.println(minNumber(nums));
    }
}
