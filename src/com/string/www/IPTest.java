package com.string.www;

import java.util.Scanner;

/**
 * @ClassName IPTest
 * @Author：Mayuan
 * @Date 2020/3/27 14:16
 * @Description TODO
 * @Version 1.0
 * IP地址和整数之间的相互的转换
 * <p>
 * <p>
 * <p>
 * # 原理：ip地址的每段可以看成是一个0-255的整数，把每段拆分成一个二进制形式组合起来，然后把这个二进制数转变成
 * # 一个长整数。
 * # 举例：一个ip地址为10.0.3.193
 * # 每段数字             相对应的二进制数
 * # 10                   00001010
 * # 0                    00000000
 * # 3                    00000011
 * # 193                  11000001
 * # 组合起来即为：00001010 00000000 00000011 11000001,转换为10进制数就是：167773121，即该IP地址转换后的数字就是它了。
 * # 的每段可以看成是一个0-255的整数，需要对IP地址进行校验
 * <p>
 * # 输入描述:
 * # 输入
 * # 1 输入IP地址
 * # 2 输入10进制型的IP地址
 * <p>
 * # 输出描述:
 * # 输出
 * # 1 输出转换成10进制的IP地址
 * # 2 输出转换后的IP地址
 * <p>
 * # 示例1
 * #
 * <p>
 * # 10.0.3.193
 * # 167969729
 * <p>
 * <p>
 * # 输出：
 * <p>
 * # 167773121
 * # 10.3.3.193
 **/

public class IPTest {

    public static long IpToInteger(String str) {

        String[] str2 = str.split("\\.");
        str2[0] = Integer.toBinaryString(Integer.parseInt(str2[0]));
        str2[1] = Integer.toBinaryString(Integer.parseInt(str2[1]));
        str2[2] = Integer.toBinaryString(Integer.parseInt(str2[2]));
        str2[3] = Integer.toBinaryString(Integer.parseInt(str2[3]));


        // 统一的整理成8个位数的形式。
        while (str2[0].length() < 8) {
            str2[0] = "0" + str2[0];
        }

        while (str2[1].length() < 8) {
            str2[1] = "0" + str2[1];
        }

        while (str2[2].length() < 8) {
            str2[2] = "0" + str2[2];
        }

        while (str2[3].length() < 8) {
            str2[3] = "0" + str2[3];
        }

        long temp = 0;
        for (int i = 0; i < str2.length; i++) {
            for (int j = 0; j < str2[0].length(); j++) {
                temp = temp * 2 + (str2[i].charAt(j) - '0');
            }
        }
        return temp;
    }

    public static String IntegerToIp(String num) {
        long temp = Long.parseLong(num);
        String binaTemp = Long.toBinaryString(temp);

        String[] strTemp = new String[4];

        strTemp[0] = binaTemp.substring(0, binaTemp.length() - 24);
        strTemp[1] = binaTemp.substring(strTemp[0].length(), strTemp[0].length() + 8);
        strTemp[2] = binaTemp.substring(strTemp[0].length() + strTemp[1].length(), strTemp[0].length() + strTemp[1].length() + 8);
        strTemp[3] = binaTemp.substring(binaTemp.length() - 8, binaTemp.length());

        StringBuilder sb = new StringBuilder();
        sb.append((Integer.parseInt(strTemp[0], 2)));
        sb.append(".");
        sb.append((Integer.parseInt(strTemp[1], 2)));
        sb.append(".");
        sb.append((Integer.parseInt(strTemp[2], 2)));
        sb.append(".");
        sb.append((Integer.parseInt(strTemp[3], 2)));

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.next();
            String str2 = sc.next();

            System.out.println(IpToInteger(str1));
            System.out.println(IntegerToIp(str2));
        }
    }
}