package com.shuzu.www;

/**
 * @ClassName RotateArrays
 * @Author：Mayuan
 * @Date 2020/12/22/0022 8:56
 * @Description TODO
 * @Version 1.0
 * <p>
 * 旋转数组的最小值。
 **/

public class RotateArrays {
    public int minArray(int[] numbers) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (numbers[mid] < numbers[r]) {
                r = mid;
            } else if (numbers[mid] > numbers[r]) {
                l = mid + 1;
            } else {
                r = r - 1;
            }
        }
        return numbers[l];
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(new RotateArrays().minArray(nums));
    }
}

