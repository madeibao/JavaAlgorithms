package com.algorithm.www;

import java.util.Scanner;

/**
 * @program: JavaWorkSpace2->DayOfYear
 * @description: 一年中的第几天
 * @author: MaYuan
 * @create: 2020-01-06 21:38
 * @version: 1.0
 * <p>
 * 按照1995-8-11的格式来进行输入内容。
 **/
public class DayOfYear {
    private static boolean reapYear(int year) {

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] mday1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] mday2 = {31, 29, 31, 30, 31, 30, 31, 31, 0, 31, 30, 31};

        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String[] split = date.split("-");

        int year = Integer.parseInt((split[0]));
        int day = Integer.parseInt(split[2]);
        int month = Integer.parseInt(split[1]);

        int result = 0;

        if (reapYear(year)) {
            for (int i = 0; i < month - 1; i++) {
                result += mday2[i];
            }
        } else {
            for (int i = 0; i < month - 1; i++) {
                result += mday1[i];
            }
        }
        System.out.println(result + day);
    }
}
