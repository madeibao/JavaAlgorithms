package com.algorithm.www;

import java.util.Scanner;

/**
 * @ClassName LegalTestIp
 * @Author：Mayuan
 * @Date 2020/3/27 22:06
 * @Description TODO
 * @Version 1.0
 * 判断是否为合法的IP
 * 现在IPV4下用一个32位无符号整数来表示，一般用点分方式来显示，点将IP地址分成4个部分，每个部分为8位，表示成一个无符号整数（因此不需要用正号出现），如10.137.17.1，是我们非常熟悉的IP地址，一个IP地址串中没有空格出现（因为要表示成一个32数字）。
 * <p>
 * 现在需要你用程序来判断IP是否合法。
 * <p>
 * <p>
 * 输入描述:
 * 输入一个ip地址
 * <p>
 * 输出描述:
 * 返回判断的结果YES or NO
 * <p>
 * 示例1
 * 输入
 * 复制
 * 10.138.15.1
 * 输出
 * 复制
 * YES
 **/
public class LegalTestIp {

    public static String legal(String[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (Integer.parseInt(nums[i]) >= 0 && Integer.parseInt(nums[i]) <= 255) {
                continue;
            } else {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] str2 = str.split("\\.");
            System.out.println(legal(str2));
        }
    }
}



