package com.shuzu.www;

/**
 * @ClassName JumpBoard
 * @Author：Mayuan
 * @Date 2020/5/26 21:55
 * @Description TODO
 * @Version 1.0
 * <p>
 * 跳板问题合集
 **/
public class JumpBoard {
    public static int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[]{0};
        }

        if (shorter == longer) {
            return new int[]{k * shorter};
        }

        int[] nums = new int[k + 1];
        for (int i = 0; i < k + 1; i++) {
            nums[i] = (k - i) * shorter + i * longer;
        }
        return nums;
    }

    public static void main(String[] args) {

        int shorter = 1,
                longer = 2,
                k = 3;
        int[] res = divingBoard(shorter, longer, k);
        for (int j : res) {
            System.out.println(j);
        }

    }
}
