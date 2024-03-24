package com.algorithm.www;

/**
 * @ClassName HanMingDistanceSum2
 * @Author：Mayuan
 * @Date 2020/6/5 22:19
 * @Description TODO
 * @Version 1.0
 * <p>
 * 汉明距离统计结果值。
 **/
public class HanMingDistanceSum2 {
    public static int totalHammingDistance(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int zero = 0;
            int one = 0;
            for (int n : nums) {
                // 移位的运算符优先级别更高。
                if ((n & 1 << i) == (1 << i)) {
                    one++;
                } else {
                    zero++;
                }
            }
            ans += zero * one;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 14, 2};
        System.out.println(totalHammingDistance(nums));

    }
}
