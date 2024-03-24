package com.algorithm.www;

/**
 * @ClassName SpecialSum
 * @Author：Mayuan
 * @Date 2021/6/4/0004 16:39
 * @Description TODO
 * @Version 1.0
 * 特殊的求和方式。
 *求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * 示例 1：
 *
 * 输入: n = 3
 * 输出: 6
 * 示例 2：
 *
 * 输入: n = 9
 * 输出: 45
 *
 **/
public class SpecialSum {

    static int getSum(int n) {
        boolean flag = n>1&&(n+=getSum(n-1))>0;
        return n;
    }
    public static void main(String[] args) {
        System.out.println(getSum(3));
    }
}
