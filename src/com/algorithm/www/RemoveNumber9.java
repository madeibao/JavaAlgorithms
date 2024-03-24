package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->RemoveNumber9
 * @description: 删除包含有数字9的内容
 * @author: MaYuan
 * @create: 2020-02-09 14:26
 * @version: 1.0
 * <p>
 * 本题目讲解的是如何来求9进制的数字内容。
 * Start from integer 1, remove any integer that contains 9 such as 9, 19, 29...
 * <p>
 * So now, you will have a new integer sequence: 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, ...
 * <p>
 * Given a positive integer n, you need to return the n-th integer after removing. Note that 1 will be the first integer.
 * ————————————————
 * 版权声明：本文为CSDN博主「huanghanqian」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/huanghanqian/article/details/77187600
 * 移除数中包含有9的数字内容。
 **/
public class RemoveNumber9 {

    private static int newIntegerNum(int n) {
        return Integer.parseInt(Integer.toString(n, 9));
    }

    private static int newIntegerNum2(int n) {
        int base = 1;
        int result = 0;
        while (n > 0) {
            result = result + n % 9 * base;
            base = base * 10;
            n = n / 9;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(newIntegerNum(9));
    }
}
