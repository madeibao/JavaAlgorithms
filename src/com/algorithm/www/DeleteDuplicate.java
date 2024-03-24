package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->DeleteDuplicate
 * @description: 删除数组中的重复出现的元素内容
 * @author: MaYuan
 * @create: 2020-01-28 15:46
 * @version: 1.0
 **/
public class DeleteDuplicate {

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[count]) {
                count++;
                nums[count] = nums[i];
            }
        }
        return ++count;
    }

    public static int removeDuplicates2(int[] nums) {
        assert nums != null;
        if (nums.length < 2) {
            return nums.length;
        }
        int cur = 0;
        int ahead = 1;
        while (ahead < nums.length) {
            if (nums[ahead] != nums[cur]) {
                nums[++cur] = nums[ahead];
            }
            ahead++;
        }
        return cur + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates2(nums));
    }
}
