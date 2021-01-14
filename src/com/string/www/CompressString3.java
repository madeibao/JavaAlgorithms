package com.string.www;

import java.util.Scanner;

/**
 * @ClassName CompressString3
 * @Author：Mayuan
 * @Date 2020/5/31 15:11
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的压缩方式2
 * Input
 * The first line contains an integer N (1 <= N <= 100) which indicates the number of test cases.
 * The next N lines contain N strings. Each string consists of only 'A' - 'Z' and the length is less than 10000.
 * Output
 * For each test case, output the encoded string in a line.
 * <p>
 * <p>
 * Sample Input
 * 2
 * ABC
 * ABBCCC
 * <p>
 * <p>
 * Sample Output
 * ABC
 * A2B3C
 * <p>
 * <p>
 * Author
 * ZHANG Zheng
 **/
public class CompressString3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            String s = in.next();
            char[] a = new char[s.length() + 1];
            for (int i = 0; i < s.length(); i++) {
                a[i] = s.charAt(i);
            }

            // 特别留意的是最后的一个空格的结果
            a[s.length()] = ' ';
            int count = 1;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i + 1] == a[i]) {
                    count++;
                } else {
                    if (count == 1) {
                        System.out.println(a[i]);
                    } else {
                        System.out.println(count + "" + a[i]);
                    }
                    count = 1;
                }
            }
            System.out.println();
        }
    }
}
