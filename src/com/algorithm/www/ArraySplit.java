package com.algorithm.www;

import java.util.Arrays;

/**
 * @program: JavaWorkSpace2->ArraySplit
 * @description: 数组的拆分的操作内容
 * @author: MaYuan
 * @create: 2020-02-05 20:46
 * @version: 1.0
 * <p>
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,4,3,2]
 * <p>
 * 输出: 4
 * 解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
 * <p>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/

public class ArraySplit {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 3};
        System.out.println(arrayPairSum(nums));
    }
}



