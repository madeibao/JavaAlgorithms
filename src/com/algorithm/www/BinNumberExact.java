package com.algorithm.www;

/**
 * @ClassName BinNumberExact
 * @Author：Mayuan
 * @Date 2020/5/6 17:03
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二进制的小数表示中精确额表示
 **/
public class BinNumberExact {

    public static String printBin(double num) {

        String res = "0.";
        double base = 0.5;
        //继续判断的条件就是num依然存在
        while (num > 0) {
            //判断某位是用1还是用0表示
            if (num >= base) {
                res += "1";
                num -= base;
            } else
                res += "0";
            //移动一位
            base /= 2;
            //“0.”占2个字符位置。
            if (res.length() > 34) {
                res = "Error";
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        double num = 0.625;
        System.out.println(printBin(num));
    }
}
