package com.shuzu.www;

/**
 * @ClassName AppearTwoNumber2
 * @Author：Mayuan
 * @Date 2020/2/27 16:11
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个数组中出现两次的数字
 **/
public class AppearTwoNumber2 {
    public static int[] singleNumbers(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int diff = xor & (-xor);
        int x = 0;
        for (int num : nums) {
            if ((diff & num) != 0) {
                x ^= num;
            }
//                x ^= num;
        }
        return new int[]{x, xor ^ x};
    }

    public static void main(String[] args) {
        int[] nums = {12, 3, 3, 4, 4, 5, 5, 7, 7, 6, 6, 9};
        int[] temp = singleNumbers(nums);
        System.out.println("--------------------");
        for (int j : temp) {
            System.out.print(j + " ");
        }

    }
}
