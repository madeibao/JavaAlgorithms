package com.algorithm.www;

/**
 * @ClassName ExchangeNumber
 * @Author：Mayuan
 * @Date 2020/2/25 17:39
 * @Description TODO
 * @Version 1.0
 * <p>
 * 交换两个数字
 **/
public class ExchangeNumber {
    
    private static void exchange(int[] nums) {
        int temp;
        temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
    }

    private static void exchange2(int[] nums) {

        nums[0] ^= nums[1];
        nums[1] ^= nums[0];
        nums[0] ^= nums[1];
    }

    public static void swap() {
        int a= 10, b= 20;
        System.out.println(a+"   "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a+"   "+b);

    }
    public static void main(String[] args) {
        int[] nums = {1, 2};
        exchange2(nums);
        for (int j : nums) {
            System.out.print(j + " ");
        }
        System.out.println();
        swap();
    }
}
