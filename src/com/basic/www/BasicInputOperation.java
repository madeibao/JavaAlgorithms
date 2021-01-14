package com.basic.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @program: JavaWorkSpace2->BasicInputOperation
 * @description: 基本的输入内容
 * @author: MaYuan
 * @create: 2019-12-25 21:55
 * @version: 1.0
 **/
public class BasicInputOperation {
    public static void main(String[] args) throws IOException {

        // 要抛出异常。
        Scanner sc = new Scanner(System.in);
        //java11
        var num = sc.nextInt();
        float num2 = sc.nextFloat();
        String str = sc.next();
        System.out.println(num);
        System.out.println(num2);
        System.out.println(str);
        sc.close();

        //获得连续的多个输入内容部分
        while (sc.hasNext()) {
            int num3 = sc.nextInt();
            System.out.println(num3);
        }
        // 输入的内容。
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");

        // 如果是变成整数
        int m = Integer.parseInt(line[0]);
        int n = Integer.parseInt(line[1]);
        int o = Integer.parseInt(line[2]);
        // ......
    }
}



