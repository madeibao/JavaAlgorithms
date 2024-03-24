package com.algorithm.www;

import java.util.Arrays;

/**
 * @ClassName AppearOnceNumber3
 * @Author：Mayuan
 * @Date 2021/6/4/0004 17:21
 * @Description TODO
 * @Version 1.0
 *
 * 出现一次的数字。
 *
 **/
public class AppearOnceNumber3 {

    public static int[] singleNumbers(int[] nums) {
        int x = 0, y = 0, n = 0, m = 1;
        // 1. 遍历异或 得到的二进制可以看出a,b两个数哪个位置不同，不同的为1
        for(int num : nums) {
            n^=num;
        }

        // 2. 循环左移，计算 m，当&为0的时候证明 n在m位上为0，两个数相同，不能区分所以要左移，直到n在m位上为1才可以区分。
        while((n & m) == 0) {
            m<<=1;
        }
        // 3. 遍历 nums 分组
        // 不是一家人，不进一家门。
        for(int num: nums) {
            // 4. 当 num & m != 0
            if((num & m) != 0) {
                x ^= num;
            }
            // 4. 当 num & m == 0
            else {
                y ^= num;
            }
        }
        // 5. 返回出现一次的数字
        return new int[] {x, y};
    }
    public static void main(String[] args) {
        int[] nums = {3,3,5,5,9,8};
        int[] res = singleNumbers(nums);
        System.out.println(Arrays.toString(res));
    }
}
