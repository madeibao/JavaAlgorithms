package com.algorithm.www;

/**
 * @program: Pro1->IsReapYear
 * @description: 判断是否为闰年
 * @author: MaYuan
 * @create: 2019-12-25 19:56
 * @version: 1.0
 **/
public class IsReapYear {
    private static boolean reapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }

    private static boolean reapYear2(int year) {
        if (year % 400 == 0) {
            return true;
        } else {
            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(reapYear2(1996));
    }
}
