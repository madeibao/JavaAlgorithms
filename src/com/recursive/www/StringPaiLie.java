package com.recursive.www;

import java.util.Scanner;

/**
 * @program: Pro1->StringPaiLie
 * @description: 字符串的全排列
 * @author: MaYuan
 * @create: 2019-12-23 21:01
 * @version: 1.0
 * 一个字符串内容的全排列。
 * a b c d
 **/
public class StringPaiLie {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("请输入一个数组，使用空格分割:");
        Scanner scanner = new Scanner(System.in);
        //使用nextLine只会将Enter当做结束符
        String rawInput = scanner.nextLine();
        String[] perm = rawInput.split(" ");
        perm(perm, 0, perm.length - 1);
        scanner.close();
    }

    static void perm(String[] list, int k, int m) {
        if (k == m) {
            //没有到最后一个   所以还需要进行排列
            for (int i = 0; i < list.length; i++)
                System.out.print(list[i] + " ");
            System.out.println();
        } else {
            //进行排列
            for (int i = k; i <= m; i++) {
                //进行交换  从而完成全排列
                String c = list[i];
                list[i] = list[k];
                list[k] = c;
                perm(list, k + 1, m);
                //需要交换回来 不然就会乱了顺序
                c = list[i];
                list[i] = list[k];
                list[k] = c;
            }
        }
    }
}




