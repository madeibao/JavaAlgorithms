package com.algorithm.www;

/**
 * @ClassName DuplicateNumber2
 * @Author：Mayuan
 * @Date 2020/5/26 20:29
 * @Description TODO
 * @Version 1.0
 * <p>
 * 重复出现的数字
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,4,2,2]
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [3,1,3,4,2]
 * 输出: 3
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-duplicate-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class DuplicateNumber2 {

    public static int findDuplicate(int[] nums) {
        int nextNum = nums[0];
        while (nums[nextNum] != -1) {
            int temp = nums[nextNum];
            nums[nextNum] = -1;
            nextNum = temp;
        }
        return nextNum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2,};
        System.out.println(findDuplicate(nums));
    }
}
