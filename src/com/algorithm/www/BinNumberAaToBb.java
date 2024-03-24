package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->BinNumberAToB
 * @description: 二进制改变多少位由A变成B
 * @author: MaYuan
 * @create: 2019-12-25 21:35
 * @version: 1.0
 **/
public class BinNumberAaToBb {
    public static int calcCost(int A, int B) {
        // write code here
        //bitCount方法统计二进制中的1的个数。
        return Integer.bitCount(A ^ B);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        //15
        System.out.println(a ^ b);
        System.out.println(calcCost(a, b));
    }
}







