package com.algorithm.www;

/**
 * @ClassName NextPermutation
 * @Author：Mayuan
 * @Date 2020/6/21 16:04
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 下一个排列的结果值。
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * 必须原地修改，只允许使用额外常数空间。
 * <p>
 * <p>
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 * <p>
 * 思路：首先观察一个数组　    1 2 7 4 3 1 .
 * 他的下一个排列是　　　　　 1 3 1 2 4 7 。
 * 列举多个这样的数组可以发现规律，
 * 原始数组在从右往左遍历，2，7为 降序排列，在遍历1，3，4，7时都为升序，则找到如下规律：
 * 当遍历发现为降序排列：即nums[i]>nums[i-1]。我们依然从右往左遍历寻找1，2，4，7中第一个比2更大的
 * 数字。
 * 之后交换2 ，3 。 因此 数组变为  1 3 7 4 2 1   可以发现3之后的数组7 4 2 1 从左往右是整齐的降序排列。
 * 因此对其进行逆转。  代码如下：
 **/
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        //提前获得下标用于后面的swap 交换
        int i, j;
        //这里用len-2,避免了用Len-1之后使用nums[i-1]的尴尬  。或者for(i=nums.size()-1;i>0;i--） 用nums[i]>nums[i-1]
        for (i = len - 2; i >= 0; i--) {
            if (nums[i + 1] > nums[i]) {
                //寻找后面序列总第一个比nums[i]大的数字
                for (j = len - 1; j > i; j--) {
                    if (nums[j] > nums[i]) {
                        break;
                    }
                }
                //找到第一个比Nums[i]更大的数，两者交换之后依然是一个整齐的降序数组，因此将其反转
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                reverse(nums, i + 1, len - 1);
                return;
            }
        }
        reverse(nums, 0, len - 1);
    }

    /**
     * 逆序这个数组的结果值。
     *
     * @param nums
     * @param left
     * @param right
     */
    public void reverse(int[] nums, int left, int right) {

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        new NextPermutation().nextPermutation(nums);
        for (int j : nums) {
            System.out.print(j + " ");
        }
    }
}
