package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->TwoNumbersComposed
 * @description: 两个数字的组合内容
 * @author: MaYuan
 * @create: 2020-01-16 18:20
 * @version: 1.0
 * <p>
 * 给定一个数字，然后返回的是两个数字，两个数字的和为给定数字，
 * 且两个数字中不能包含有0字符。
 **/
public class TwoNumbersComposed {
    private static int[] getNoZeroIntegers(int n) {
        int i = 1;
        int j = n - i;

        while (true) {
            if (!String.valueOf(i).contains("0") && !String.valueOf(j).contains("0")) {
                return new int[]{i, j};
            }
            i += 1;
            j -= 1;
        }
    }

    public static void main(String[] args) {
        int num = 14;
        int[] nums = getNoZeroIntegers(num);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
