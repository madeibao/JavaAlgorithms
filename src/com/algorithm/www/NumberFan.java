package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->NumberFan
 * @description: 数字的反码内容
 * @author: MaYuan
 * @create: 2020-02-05 22:14
 * @version: 1.0
 * <p>
 * 每个非负整数 N 都有其二进制表示。例如， 5 可以被表示为二进制 "101"，11 可以用二进制 "1011" 表示，依此类推。注意，除 N = 0 外，任何二进制表示中都不含前导零。
 * <p>
 * 二进制的反码表示是将每个 1 改为 0 且每个 0 变为 1。例如，二进制数 "101" 的二进制反码为 "010"。
 * <p>
 * 给定十进制数 N，返回其二进制表示的反码所对应的十进制整数。
 * 示例 1：
 * <p>
 * 输入：5
 * 输出：2
 * 解释：5 的二进制表示为 "101"，其二进制反码为 "010"，也就是十进制中的 2 。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：7
 * 输出：0
 * 解释：7 的二进制表示为 "111"，其二进制反码为 "000"，也就是十进制中的 0 。
 **/
public class NumberFan {
    public static int bitwiseComplement(int N) {
        if (N == 0) {
            return 1;
        }
        int temp = N;
        int num = 1;

        // 求出这个数字的最接近的2的整数倍的内容。
        while (N > 0) {
            num = num << 1;
            N = N / 2;
        }
        num--;
        return temp ^ num;
    }

    public static void main(String[] args) {
        System.out.println(bitwiseComplement(15));
    }
}
