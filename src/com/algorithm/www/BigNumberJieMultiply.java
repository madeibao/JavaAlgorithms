package com.algorithm.www;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @program: JavaWorkSpace2->BigNumberJieMultiply
 * @description: 超大数字阶乘算法
 * @author: MaYuan
 * @create: 2019-12-25 21:31
 * @version: 1.0
 **/
public class BigNumberJieMultiply {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long num = cin.nextLong();
        BigInteger ans = new BigInteger("1");
        while (num > 0) {
            ans = ans.multiply(BigInteger.valueOf(num));
            num -= 1;
        }
        System.out.println(ans);
        cin.close();
    }
}
