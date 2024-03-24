package com.algorithm.www;

/**
 * @ClassName HanMingDistanceSum
 * @Author：Mayuan
 * @Date 2020/6/5 22:00
 * @Description TODO
 * @Version 1.0
 * <p>
 * 数组的汉明距离统计和。
 **/
public class HanMingDistanceSum {
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        int[] nums = {4, 14, 2};
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i != j) {
                    res += hammingDistance(nums[i], nums[j]);
                }
            }
        }

        System.out.println(res);
    }

}
