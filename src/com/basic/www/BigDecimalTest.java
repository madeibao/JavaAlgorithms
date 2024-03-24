package com.basic.www;

import java.math.BigDecimal;

/**
 * @ClassName BigDecimalTest
 * @Author：Mayuan
 * @Date 2020/5/31 16:00
 * @Description TODO
 * @Version 1.0
 **/
public class BigDecimalTest {
    // java的定义上的，精确度极高的类

    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal("12323.000");

        // 输出12323
        System.out.println(bd.stripTrailingZeros());
        BigDecimal bd2 = new BigDecimal("1.23E10");

        //  12300000000
        System.out.println(bd2.toPlainString());
    }
}
