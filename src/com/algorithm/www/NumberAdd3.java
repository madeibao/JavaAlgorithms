package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->NumberAdd3
 * @description: 数字的各个位置的数字相加
 * @author: MaYuan
 * @create: 2020-02-04 16:43
 * @version: 1.0
 * <p>
 * 求一个数字的各个位数的和的内容。
 **/
public class NumberAdd3 {
    public static int addDigits(int num) {
        int res = 0;
        while (num != 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(123));
    }
}
