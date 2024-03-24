package com.shuzu.www;

/**
 * @program: JavaWorkSpace2->AppearOnceNumber
 * @description: 数组中只是出现一次的元素内容
 * @author: MaYuan
 * @create: 2019-12-29 20:56
 * @version: 1.0
 * <p>
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * <p>
 * 示例 2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 **/
public class AppearOnceNumber {
    public static int singleNumber(int[] nums) {
        /**
         * 异或：5^5=0，5^0=5，相同的数异或得到0，
         * 与0异或得到本身，所以把数组所有的数异或一遍，一对对情侣都消掉，就剩那个单身狗了。 java实现：
         */
        int result = 0;
        for (int j : nums) {
            result = result ^ j;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }
}
