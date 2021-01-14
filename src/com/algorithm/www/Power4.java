package com.algorithm.www;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @ClassName Power4
 * @Author：Mayuan
 * @Date 2020/5/30 20:03
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 算法的指数运算结果值。
 **/
public class Power4 {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            BigDecimal R = scanner.nextBigDecimal();
            if (R.compareTo(BigDecimal.ZERO) == 0) {
                System.out.println("0");
                continue;
            }
            int n = scanner.nextInt();
            if (n == 0) {
                System.out.println("1");
                continue;
            }
            BigDecimal t = R;
            for (int i = 1; i != n; ++i) {
                R = R.multiply(t);
            }
            String res = R.stripTrailingZeros().toPlainString();
            if (res.charAt(0) == '0' && res.length() > 1) {
                System.out.println(res.substring(1));
            } else {
                System.out.println(res);
            }
        }
    }
}
