package com.sort.www;

/**
 * 煎饼排序算法
 *
 * @ClassName PanCakeSort2
 * @Author：Mayuan
 * @Date 2025/3/23/星期日 16:08
 * @Description TODO
 * @Version 1.0
 **/
public class PanCakeSort2 {
    public static int[] panCakeSort(int[] nums) {
        int len = nums.length;
        for (int i = len; i > 1; i--) {
            int index = index(nums, i);
            if (index != i - 1) {
                exchange(nums, index);
                exchange(nums, i - 1);
            }
        }
        return nums;
    }

    public static int index(int[] nums, int k) {
        int index = 0;
        for (int i = 0; i < k; i++) {
            if (nums[i] >= nums[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void exchange(int[] nums, int k) {
        int i = 0, j = k;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1, 5, 4, 8, 3, 2};
        int[] res = panCakeSort(nums);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
