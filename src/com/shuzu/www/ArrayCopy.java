package com.shuzu.www;

import java.util.Arrays;

/**
 * @ClassName ArrayCopy
 * @Author：Mayuan
 * @Date 2020/2/25 11:20
 * @Description TODO
 * @Version 1.0
 * <p>
 * 整体的复制一个数组
 **/
public class ArrayCopy {
    private static int[] copy1(int[] nums) {
        int[] temp = new int[nums.length];
        // 参数分析， 源数组，数组起始位置，目标数组，目标数组的起始位置，要复制的数组元素的数量。
        System.arraycopy(nums, 0, temp, 0, nums.length);
        return temp;
    }

    private static int[] copy2(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = nums[i];
        }
        return temp;
    }

    private static int[] copy3(int[] nums) {

        // 复制一个数组，然后返回数组的副本。
        int[] copy = Arrays.copyOf(nums, nums.length);
        return copy;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 33, 3,};
        int[] arr = copy3(nums);
        System.out.println(Arrays.toString(arr));

    }
}
