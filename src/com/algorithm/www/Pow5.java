package com.algorithm.www;

/**
 * @ClassName Pow5
 * @Author：Mayuan
 * @Date 2020/5/31 15:55
 * @Description TODO
 * @Version 1.0
 * <p>
 * 求一个数字幂运算的值。
 **/

import java.math.BigDecimal;
import java.util.*;

public class Pow5 {
    public static void main(String[] args) throws InterruptedException {
        // write your code here
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            BigDecimal a = cin.nextBigDecimal();
            int b = cin.nextInt();
            String res = a.pow(b).stripTrailingZeros().toPlainString();
            res = (res.indexOf("0.") == 0) ? (res.substring(1)) : res;
            System.out.println(res);
        }
    }
}






