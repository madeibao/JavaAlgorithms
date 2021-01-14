package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->BinOneNumber
 * @description: 一个数字的二进制的表示中的1的个数
 * @author: MaYuan
 * @create: 2019-12-31 19:35
 * @version: 1.0
 * 一个数字的二进制表示中1的个数。
 **/
public class BinOneNumber {
    public static int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        String str2 = str.replace("0", "");
        return str2.length();
    }

    public static int hammingWeight2(int n) {
        int result = 0;
        while (n != 0) {
            result += 1;
            n &= (n - 1);
        }
        return result;
    }

    public int hammingWeight4(int n) {
        return Integer.bitCount(n);
    }

    private static int hammingWeight3(int n) {
        int result = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                result += 1;
            }
            n >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight3(15));
    }
}
