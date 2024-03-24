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
        }
        return new int[]{x, xor ^ x};
    }

    static int[] helper(int[] nums) {

        int sum = 0;
        int n = nums.length;
        int i;
        for (i = 0; i < n; ++i) {
            sum ^= nums[i];
        }
        sum = sum & -sum;
        int n1 = 0;
        int n2 = 0;
        for (i = 0; i < n; ++i) {
            if((nums[i] & sum)!=0) {
                n1 ^= nums[i];
            }
            else {
                n2 ^= nums[i];
            }
        }

        return new int[]{n1, n2};
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
