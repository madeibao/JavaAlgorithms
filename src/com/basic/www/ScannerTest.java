package com.basic.www;

import java.util.Scanner;

/**
 * @ClassName ScannerTest
 * @Author：Mayuan
 * @Date 2020/3/11 22:35
 * @Description TODO
 * @Version 1.0
 **/
public class ScannerTest {

    public static void main(String[] args) {
        // \\D 用来进行匹配非数字。
        Scanner scan = new Scanner(System.in).useDelimiter("\\D");
        System.out.print("请输入当前日期（年-月-日）:");
        int year = scan.nextInt();
        int month = scan.nextInt();
        int date = scan.nextInt();

        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
        scan.close(); // 执行关闭
    }
}
