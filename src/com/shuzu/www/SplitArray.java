package com.shuzu.www;

import java.util.Scanner;

/**
 * @ClassName SplitArray
 * @Author：Mayuan
 * @Date 2020/4/7 22:19
 * @Description TODO
 * @Version 1.0
 * <p>
 * 分割数组来达到一定的要求
 **/
public class SplitArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            int index = 0, sum1 = 0, sum2 = 0;
            for (int i = 0; i < n; i++) {
                int tmp = scanner.nextInt();
                if (tmp % 5 == 0) sum1 += tmp;
                else if (tmp % 3 == 0) sum2 += tmp;
                else nums[index++] = tmp;
            }
            System.out.println(isExists(sum1, sum2, nums, 0));
        }
        scanner.close();
    }

    public static boolean isExists(int sum1, int sum2, int[] nums, int index) {
        if (index == nums.length && sum1 != sum2) {
            return false;
        }
        if (index == nums.length && sum1 == sum2) {
            return true;
        }
        if (index < nums.length) {
            return isExists(sum1 + nums[index], sum2, nums, index + 1) || isExists(sum1, sum2 + nums[index], nums, index + 1);
        }
        return false;
    }
}
