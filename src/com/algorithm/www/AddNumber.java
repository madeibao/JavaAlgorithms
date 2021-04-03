package com.algorithm.www;

/**
 * @ClassName AddNumber
 * @Author：Mayuan
 * @Date 2020/2/17 17:14
 * @Description TODO
 * @Version 1.0
 * 一个数字的各个位数的内容来进行相加，求得最终的结果的内容。
 * 题目描述：给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 * <p>
 * 示例：
 * <p>
 *  输入: 38
 *  输出: 2
 * <p>
 *  解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2
 * <p>
 * 进阶:
 * 你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
 * ————————————————
 * 版权声明：本文为CSDN博主「Untara」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/untara/article/details/82893775
 **/


public class AddNumber {
    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
        int num = 2252;
        System.out.println(addDigits(num));
    }
}










