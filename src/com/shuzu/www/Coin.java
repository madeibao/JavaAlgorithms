package com.shuzu.www;

/**
 * @ClassName Coin
 * @Author：Mayuan
 * @Date 2020/5/27 16:15
 * @Description TODO
 * @Version 1.0
 * <p>
 * 桌子上有一堆的硬币，求相应的硬币的取法，
 * 可以同时取走一枚或者是两枚硬币
 * <p>
 * 4 2 1
 **/
public class Coin {
    public static int minCount(int[] coins) {
        int cnt = 0;
        for (int j : coins) {
            if (j % 2 == 1) {
                cnt += (j + 1) / 2;
            } else {
                cnt += j / 2;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 1};
        System.out.println(minCount(nums));
    }
}
