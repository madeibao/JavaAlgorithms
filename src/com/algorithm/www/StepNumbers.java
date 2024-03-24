package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->StepNumbers
 * @description: 变成0的操作的步数
 * @author: MaYuan
 * @create: 2020-02-09 15:37
 * @version: 1.0
 **/
public class StepNumbers {
    public static int numberOfSteps(int num) {
        int step = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            step += 1;
        }
        return step;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
