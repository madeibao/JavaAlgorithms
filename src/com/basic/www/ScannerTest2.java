package com.basic.www;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName ScannerTests
 * @Author：Mayuan
 * @Date 2020/6/10 19:53
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java的各种各样的输入语句。
 **/
public class ScannerTest2 {
    public static void main(String[] args) {

//        1 问题：解决这种情况下的Scanner输入：单行，多行，数值，字符串
//        以三行输入为例，第一行输入两个数字m，n，分别表示数组num1和num2的长度，第二行和第三行输入num1和num2的元素，以空格分隔。
////   输入如下
//        3 4
//        10 2 3
//        11 4 5 6
        System.out.println("输入：");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] num1 = new int[m];
        int[] num2 = new int[n];
        // 换成其他数据类型也一样，其他数值类型就修改int跟nextInt就可以了，
        //String就把nextInt()换成next()
        for (int i = 0; i < m; i++) {
            // 一个一个读取
            num1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            num2[i] = sc.nextInt();
        }
        System.out.println("输出：");
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));

        //----------------------------------------------------------------------------------------------------
        // 输入如下
//        ABB CCC DDD  EEE 123 435
        // 依照空格来进行分割的结果值。

        /**
         *

         System.out.println("输入：");
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();  // 读取一行
         System.out.println("输出：");
         System.out.println(str);
         String[] strIn = str.trim().split(" ");  // 以空格分割
         System.out.println(Arrays.toString(strIn));
         */


    }

}
