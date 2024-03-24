package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->SpecialOperation
 * @description: 特殊的运算符内容
 * @author: MaYuan
 * @create: 2020-01-14 20:03
 * @version: 1.0
 * 不使用加减乘除的方法来实现两个数字的值的求和。
 **/
public class SpecialAdd2 {
    private static int addNumber(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 ^ num2;
            // 向左面移动位置。
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(addNumber(a, b));
    }
}
