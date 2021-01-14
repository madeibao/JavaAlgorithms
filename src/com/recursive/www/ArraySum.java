package com.recursive.www;

/**
 * @ClassName ArraySum
 * @Author：Mayuan
 * @Date 2020/3/16 16:43
 * @Description TODO
 * @Version 1.0
 * <p>
 * 求一个数组的和，并且使用递归的形式。
 **/
public class ArraySum {

    static int getSum(int n) {
        return n == 1 ? n : n + getSum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(getSum(10));
    }
}
