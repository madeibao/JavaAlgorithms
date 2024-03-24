package com.algorithm.www;

/**
 * @ClassName AppearOnceNumber2
 * @Author：Mayuan
 * @Date 2020/6/7 21:53
 * @Description TODO
 * @Version 1.0
 * 字符串中出现一次的两个数字。
 * 一个数组中有两个数字出现了一次，找出他们。
 **/
public class AppearOnceNumber2 {

    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for (int n : nums) {
            diff ^= n;
        }
        diff = Integer.highestOneBit(diff);
        int[] result = {0, 0};
        for (int n : nums) {
            //当前位是 0 的组, 然后组内异或
            if ((diff & n) == 0) {
                result[0] ^= n;
                //当前位是 1 的组
            } else {
                result[1] ^= n;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 3, 5, 4};

    }
}
