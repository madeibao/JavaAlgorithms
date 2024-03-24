package com.recursive.www;

import java.util.Scanner;

/**
 * @program: Pro1->StringPaiLie2
 * @description: 字符串内容的全排列
 * @author: MaYuan
 * @create: 2019-12-23 21:28
 * @version: 1.0
 * 例题：
 * 输入一串字符串，将该字符串中的字符元素进行全排列，然后，一串输出结果。
 * <p>
 * 例如：
 * <p>
 * 输入：
 * ABCD
 * <p>
 * 输出：
 * ABCD
 * ABDC
 * ACBD
 * ACDB
 * ADBC
 * ADCB
 * BACD
 * BADC
 * BCAD
 * BCDA
 * BDAC
 * BDCA
 * CABD
 * CADB
 * CBAD
 * CBDA
 * CDAB
 * CDBA
 * DABC
 * DACB
 * DBCA
 * DBAC
 * DCAB
 * DCBA
 **/
public class StringPaiLie2 {
    public static void sq(char[] data, int k) {
        if (k == data.length) {
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        for (int i = k; i < data.length; i++) {
            {
                char temp = data[k];
                data[k] = data[i];
                data[i] = temp;
            }

            sq(data, k + 1);
            {
                char temp = data[k];
                data[k] = data[i];
                data[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String yy;
        Scanner qq = new Scanner(System.in);
        yy = qq.next();
        char[] data = yy.toCharArray();
        sq(data, 0);
        qq.close();
    }
}
