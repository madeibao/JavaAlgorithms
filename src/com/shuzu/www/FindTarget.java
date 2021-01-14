package com.shuzu.www;

/**
 * @ClassName FindTarget
 * @Author：Mayuan
 * @Date 2020/3/28 15:58
 * @Description TODO
 * @Version 1.0
 * <p>
 * 查询目标在数组中的出现次数
 **/
public class FindTarget {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int lo = 0, hi = nums.length - 1;
        return binarySearch(nums, lo, hi, target);
    }

    private int binarySearch(int[] nums, int lo, int hi, int target) {
        int count = 0;
        if (lo == hi) {
            return nums[lo] == target ? ++count : 0;
        }
        int mid = (lo + hi) / 2;
        if (lo < mid && nums[mid] > target) {
            count += binarySearch(nums, lo, mid - 1, target);
        } else if (mid < hi && nums[mid] < target) {
            count += binarySearch(nums, mid + 1, hi, target);
        } else {
            int i = mid, j = mid - 1;
            while (i < nums.length && nums[i++] == target) count++;
            while (j >= 0 && nums[j--] == target) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(new FindTarget().search(nums, target));
    }
}
