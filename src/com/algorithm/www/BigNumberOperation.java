package com.algorithm.www;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @program: JavaWorkSpace2->BigNumberOperation
 * @description: 大数的运算
 * @author: MaYuan
 * @create: 2019-12-25 21:01
 * @version: 1.0
 **/
public class BigNumberOperation {

    public static String addNumber(String str1, String str2) {

        BigDecimal num1 = new BigDecimal(str1);
        BigDecimal num2 = new BigDecimal(str2);
        //然后通过BigDecimal的加减乘除方法，进行运算：加法：
        BigDecimal result = num1.add(num2);

        /**
         * 加法
         BigDecimal result = num1.add(num2);
         减法
         BigDecimal result = num1.subtract(num2);
         乘法
         BigDecimal result = num1.multiply(num2);
         除法
         BigDecimal result = num1.divide(num2);
         */

        return result.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        String sum = addNumber(num1, num2);
        System.out.println(sum);
        sc.close();
    }
}
