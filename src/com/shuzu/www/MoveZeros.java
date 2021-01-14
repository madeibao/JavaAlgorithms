package com.shuzu.www;

/**
 * @program: JavaWorkSpace2->MoveZeros
 * @description: 移动数字0
 * @author: MaYuan
 * @create: 2019-12-29 20:14
 * @version: 1.0
 * 必须是原地的内容来进行操作，不能进行拷贝数组等操作。
 * <p>
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 **/
public class MoveZeros {
    private static void moveZeroes(int[] nums) {

        int i = 0, j = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        while (j < nums.length) {
            nums[j++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
