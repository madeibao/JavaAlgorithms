package com.shuzu.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MinNumber3
 * @Author：Mayuan
 * @Date 2020/9/26 10:49
 * @Description TODO
 * @Version 1.0
 * <p>
 * 数组来组成的最小额数字。
 **/
public class MinNumber3 {
    public static String minNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int num : nums) {
            list.add(String.valueOf(num));
        }
        list.sort((o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        return String.join("", list);
    }

    public static void main(String[] args) {

        int[] nums = {10, 2,1,12};
        System.out.println(minNumber(nums));
    }
}
