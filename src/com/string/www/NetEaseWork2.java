package com.string.www;

import java.util.Scanner;

/**
 * @program: JavaWorkSpace2->NetEaseWork2
 * @description: 网易笔试题方法2
 * @author: MaYuan
 * @create: 2019-12-27 19:51
 * @version: 1.0
 **/


public class NetEaseWork2 {
    /**
     * 只有L：1L西，2L南，3L东，4L北
     * 只有R：1R东，2R南，3R西，4R北
     * 刚开始想的做法是都是L或者R和既有L又有R的分开情况去搞，做完AC了，然后一看代码四个判断条件怎么感觉有点多啊，然后每两个判断
     * 条件输出的代码是一样的，发现这样做有点多余了啊，只需要考虑L和R的差值就可以了
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

//        //用来标识所有字符是否相同
//
//        int flag = 0;

        //统计字符串中有L、R各多少个字符

        int Lcount = 0, Rcount = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'L') {
                Lcount++;
            } else {
                Rcount++;
            }
        }

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
