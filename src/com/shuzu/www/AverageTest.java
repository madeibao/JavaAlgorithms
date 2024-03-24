package com.shuzu.www;

import java.util.Scanner;

/**
 * @ClassName AverageTest
 * @Author：Mayuan
 * @Date 2020/3/27 21:39
 * @Description TODO
 * @Version 1.0
 * <p>
 * 取平均数的结果
 **/
public class AverageTest {

    private static boolean isTrue(int[] nums) {
        if (nums.length % 2 == 1) {
            return false;
        }

        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0 && nums[i] % 5 == 0) {
                sum1 += nums[i];
            }
        }

        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 5 == 0 && nums[i] % 3 == 0) {
                sum2 += nums[i];
            }
        }

        return sum1 == sum2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int[] nums = new int[num];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
        }
    }
}
