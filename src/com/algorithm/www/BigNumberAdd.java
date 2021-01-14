package com.algorithm.www;

import java.util.Scanner;

/**
 * @program: JavaWorkSpace2->BigNumberAdd
 * @description: 大数的相加和
 * @author: MaYuan
 * @create: 2019-12-25 21:11
 * @version: 1.0
 * * 两个超大的数据，用字符串的形式存储，然后相加求和。
 * <p>
 * 12345
 * 12345
 * <p>
 * 123456789876+1234567898765=1358024688641
 **/
public class BigNumberAdd {

    private static String numAdd(String str1, String str2) {
        if (str1 == null) {
            return str2;
        }
        if (str2 == null) {
            return str1;
        }
        StringBuffer s1 = new StringBuffer(str1).reverse();
        StringBuffer s2 = new StringBuffer(str2).reverse();
        // 存储的是最终的结果值。
        StringBuffer res = new StringBuffer();
        int len1 = s1.length();
        int len2 = s2.length();
        int len;
        if (len2 > len1) {
            len = len2;
            int num = len2 - len1;
            while (num-- > 0) {
                s1.append('0');
            }
        } else {
            len = len1;
            int num = len1 - len2;
            while (num-- > 0) {
                s2.append('0');
            }
        }
        // 代表的是进位
        int overFlow = 0;
        // 代表的是临时的变量值。
        int num = 0;
        for (int i = 0; i < len; i++) {
            num = s1.charAt(i) - '0' + s2.charAt(i) - '0' + overFlow;
            if (num >= 10) {
                overFlow = 1;
                num -= 10;
            } else {
                overFlow = 0;
            }
            res.append(String.valueOf(num));
        }
        if (overFlow == 1) {
            res.append('1');
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        String sum = numAdd(num1, num2);
        System.out.println(sum);
        sc.close();
    }
}
