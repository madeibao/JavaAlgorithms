package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->AddAndMultiply
 * @description: 一个整数的各位积和各位和
 * @author: MaYuan
 * @create: 2019-12-31 20:18
 * @version: 1.0
 **/
public class AddAndMultiply {
    public static int subtractProductAndSum(int n) {
        int temp = n;
        int res1 = 0;
        while (n > 0) {
            res1 += n % 10;
            n = n / 10;
        }

        int res2 = 1;
        while (temp > 0) {
            res2 *= temp % 10;
            temp = temp / 10;
        }
        return res2 - res1;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
}
