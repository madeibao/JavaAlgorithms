package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->HanmingDistance
 * @description: 两个数字的汉明码距离
 * @author: MaYuan
 * @create: 2020-01-07 20:26
 * @version: 1.0
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * <p>
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * 注意：
 * 0 ≤ x, y < 231.
 * <p>
 * 示例:
 * <p>
 * 输入: x = 1, y = 4
 * <p>
 * 输出: 2
 * <p>
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑   ↑
 **/
public class HanmingDistance {

    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }

    private static int hammingDistance2(int x, int y) {
        int z = x ^ y;
        int sum = 0;
        while (z != 0) {
            sum += z & 1;
            z = z >> 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(hammingDistance(a, b));
    }
}



