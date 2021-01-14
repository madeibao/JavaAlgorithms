package com.string.www;

import java.util.Scanner;

/**
 * @program: JavaWorkSpace2->NetEaseWork
 * @description: 网易笔试题目2019
 * @author: MaYuan
 * @create: 2019-12-27 19:24
 * @version: 1.0
 * 3
 * LRR
 * 输出 E
 **/

public class NetEaseWork {

    /**
     * 只有L：1L西，2L南，3L东，4L北
     * 只有R：1R东，2R南，3R西，4R北
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        //用来标识所有字符是否相同
        int flag = 0;
        //统计字符串中有L、R各多少个字符
        int Lcount = 0, Rcount = 0;
        for (int i = 0; i < n; i++) {
            if ((s.charAt(0) == 'L' && s.charAt(i) != 'L') || (s.charAt(0) == 'R' && s.charAt(i) != 'R')) {
                flag = 1;
            }
            if (s.charAt(i) == 'L') {
                Lcount++;
            } else {
                Rcount++;
            }
        }

        if (flag == 0) {

            if (s.charAt(0) == 'L') {

                if (n % 4 == 0) {
                    System.out.println("N");
                }

                if (n % 4 == 1) {
                    System.out.println("W");
                }
                if (n % 4 == 2) {
                    System.out.println("S");
                }
                if (n % 4 == 3) {
                    System.out.println("E");
                }
            } else {
                if (n % 4 == 0) {
                    System.out.println("N");
                }
                if (n % 4 == 1) {
                    System.out.println("E");
                }
                if (n % 4 == 2) {
                    System.out.println("S");
                }
                if (n % 4 == 3) {
                    System.out.println("W");
                }
            }
        } else {
            if (Lcount >= Rcount) {

                int p = Lcount - Rcount;

                if (p % 4 == 0) {

                    System.out.println("N");

                }

                if (p % 4 == 1) {

                    System.out.println("W");

                }

                if (p % 4 == 2) {

                    System.out.println("S");

                }

                if (p % 4 == 3) {

                    System.out.println("E");

                }

            } else {
                int q = Rcount - Lcount;
                if (q % 4 == 0) {
                    System.out.println("N");
                }
                if (q % 4 == 1) {
                    System.out.println("E");
                }
                if (q % 4 == 2) {
                    System.out.println("S");
                }
                if (q % 4 == 3) {
                    System.out.println("W");
                }
            }
        }
    }
}
