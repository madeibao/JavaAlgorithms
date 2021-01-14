package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->ExactNumber
 * @description: 判断是否能精确的表示出来
 * @author: MaYuan
 * @create: 2019-12-25 21:37
 * @version: 1.0
 * 能够用计算机来精确的进行表示出来。
 **/
public class ExactNumber {
    public static String printBin(double num) {
        String res = "0.";
        double base = 0.5;
        //继续判断的条件就是num依然存在
        while (num > 0) {
            //判断某位是用1还是用0表示
            if (num >= base) {
                res += "1";
                num -= base;
            } else {
                res += "0";
            }
            //移动一位
            base /= 2;

            //"0."占2个字符位置。说明此时出现了循环的现象。所以必不能精确的表示。
            if (res.length() > 34) {
                res = "Error";
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(printBin(0.625));
    }
}
