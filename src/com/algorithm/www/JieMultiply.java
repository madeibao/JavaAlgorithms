package com.algorithm.www;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @ClassName JieMultiply
 * @Author：Mayuan
 * @Date 2020/5/31 15:27
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 返回的是数字的阶乘
 **/
public class JieMultiply {
    public static void main(String[] argc) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int num = scan.nextInt();
            BigInteger sum = new BigInteger("1");
            for (int i = 1; i <= num; i++) {
                BigInteger bnum = new BigInteger(i + "");
                sum = sum.multiply(bnum);
            }
            System.out.println(sum.toString());
            System.gc();
        }
    }
}
