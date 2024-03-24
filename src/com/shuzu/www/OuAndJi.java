package com.shuzu.www;

/**
 * @ClassName OuAndJi
 * @Author：Mayuan
 * @Date 2020/4/15 18:50
 * @Description TODO
 * @Version 1.0
 * <p>
 * 所有的奇数调整到数组的前面
 **/
public class OuAndJi {

    public static int[] exchange(int[] nums) {

        int i = 0, j = nums.length - 1, tmp;
        while (i < j) {
            while (i < j && (nums[i] & 1) == 1) {
                i++;
            }
            while (i < j && (nums[j] & 1) == 0) {
                j--;
            }

            // 双指针同时的遇到了偶数和奇数的时候，两个数字来进行调换。
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] temp = exchange(arr);
        for (int j : temp) {
            System.out.print(j + " ");
        }
    }
}
