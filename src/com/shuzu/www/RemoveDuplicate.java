package com.shuzu.www;

/**
 * @ClassName Removeduplicate
 * @Author：Mayuan
 * @Date 2020/12/5/0005 9:47
 * @Description TODO
 * @Version 1.0
 * <p>
 * 去除数组中的重复的元素内容
 **/
public class RemoveDuplicate {

    public static int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        while (i < nums.length - 1) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
            i++;
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }
}
