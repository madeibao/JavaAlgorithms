package com.algorithm.www;

import java.util.Scanner;

/**
 * @ClassName PrimeNumber3
 * @Author：Mayuan
 * @Date 2020/3/27 21:20
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java的打印所有的质数因子
 **/
public class PrimeNumber3 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        long num = str.nextLong();
        String result = getResult(num);
        System.out.println(result);
    }

    /**
     * 经过一个字符串的形式来进行打印，获得最终的结果值。
     */
    public static String getResult(long num) {
        int pum = 2;
        String result = "";
        while (num != 1) {
            while (num % pum == 0) {
                num = num / pum;
                result = result + pum + " ";
            }
            pum++;
        }
        return result;
    }
}
