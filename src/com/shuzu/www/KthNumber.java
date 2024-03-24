package com.shuzu.www;

/**
 * @ClassName KthNumber
 * @Author：Mayuan
 * @Date 2021/3/19/0019 21:11
 * @Description TODO
 * @Version 1.0
 *
 * 第k大的数字。
 *
 **/
public class KthNumber {

    public void quickSort(int[] nums,int start, int end, int target) {
        if (start < end) {
            int i = start, j = end;

            // 选择一个基准的元素。
            int vot = nums[i];
            while (i != j) {
                while (i < j && nums[j] >= vot) {
                    j--;
                }
                if(i < j) {
                    nums[i++] = nums[j];
                }
                while (i < j && nums[i] <= vot) {
                    i++;
                }
                if (i < j) {
                    nums[j--] = nums[i];
                }
            }
            nums[i] = vot;
            if (i == nums.length - target) {
                return;
            }
            else if (i < nums.length - target) {
                quickSort(nums, i + 1, end, target);
            }
            else {
                quickSort(nums, start, i - 1,target);
            }
        }
    }

    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1, k);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k =2;
        System.out.println(new KthNumber().findKthLargest(nums,k));
    }

}
