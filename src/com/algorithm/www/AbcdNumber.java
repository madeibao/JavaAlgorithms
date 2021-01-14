package com.algorithm.www;

/**
 * @program: Pro1->AbcdNumber
 * @description: abcd*9=dcba
 * @author: MaYuan
 * @create: 2019-12-24 19:31
 * @version: 1.0
 * <p>
 * 特殊的数字内容。
 **/
public class AbcdNumber {
    public static void main(String[] args) {
        int i, a, b, c, d;
        for (i = 1000; i <= 9999; i++) {
            a = i / 1000;
            b = i % 1000 / 100;
            c = i % 100 / 10;
            d = i % 10;
            if ((d * 1000 + c * 100 + b * 10 + a) == i * 9) {
                System.out.print(i);
            }
        }
    }
}





