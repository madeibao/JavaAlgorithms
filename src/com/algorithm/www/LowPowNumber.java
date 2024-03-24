package com.algorithm.www;

import java.util.Scanner;

/**
 * @ClassName LowPowNumber
 * @Author：Mayuan
 * @Date 2020/4/7 21:07
 * @Description TODO
 * @Version 1.0
 * <p>
 * 求一个小于N的最大的完全的平方数字
 **/
public class LowPowNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {


            int temp = sc.nextInt();
            int temp2 = (int) Math.sqrt(temp);
            int res = 0;
            for (int i = 0; i <= temp2; i++) {
                if (i * i <= temp) {
                    res = Math.max(res, i * i);
                }
            }
            System.out.println(res);
        }
    }
}
