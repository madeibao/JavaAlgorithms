package com.algorithm.www;

/**
 * @program: Pro1->JieMultiplyZeroNumber
 * @description: 阶乘的尾部的零的个数
 * @author: MaYuan
 * @create: 2019-12-25 19:58
 * @version: 1.0
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 * 示例 1:
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 *
 *
 *
 **/
public class JieMultiplyZeroNumber {
    public static int trailingZeroes(int n) {
        int b = 0;
        while (n >= 5) {
            b += n / 5;
            n /= 5;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(15));
    }
}


