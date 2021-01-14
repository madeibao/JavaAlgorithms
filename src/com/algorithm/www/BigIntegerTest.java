package com.algorithm.www;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @program: JavaWorkSpace2->BigIntegerTest
 * @description: 大数的运算和基本初始化
 * @author: MaYuan
 * @create: 2019-12-25 21:04
 * @version: 1.0
 * <p>
 * * java的大数类别
 * 1.赋值：
 * BigInteger a=new BigInteger("1");
 * BigInteger b=BigInteger.valueOf(1);
 * 2.运算：
 * ① add(); 大整数相加
 * BigInteger a=new BigInteger(“23”);
 * BigInteger b=new BigInteger(“34”);
 * a. add(b);
 * ②subtract(); 相减
 * ③multiply(); 相乘
 * ④divide(); 相除取整
 * ⑤remainder(); 取余
 * ⑥pow(); a.pow(b)=a^b
 * ⑦gcd(); 最大公约数
 * ⑧abs(); 绝对值
 * ⑨negate(); 取反数
 * ⑩mod(); a.mod(b)=a%b=a.remainder(b);
 * <p>
 * 3.BigInteger构造函数：
 * 一般用到以下两种：
 * BigInteger(String val);
 * 将指定字符串转换为十进制表示形式；
 * BigInteger(String val,int radix);
 * 将指定基数的 BigInteger 的字符串表示形式转换为 BigInteger
 * 4.基本常量：
 * A=BigInteger.ONE 1
 * B=BigInteger.TEN 10
 * C=BigInteger.ZERO 0
 * 5.n.compareTo(BigInteger.ZERO)==0  //相当于n==0
 * 6.if(a[i].compareTo(n)>=0 &&a[i].compareTo(m)<=0)   // a[i]>=n && a[i]<=m
 * <p>
 * 基本的运算内容
 * <p>
 * BigInteger abs()  返回大整数的绝对值
 * BigInteger add(BigInteger val) 返回两个大整数的和
 * BigInteger and(BigInteger val)  返回两个大整数的按位与的结果
 * BigInteger andNot(BigInteger val) 返回两个大整数与非的结果
 * BigInteger divide(BigInteger val)  返回两个大整数的商
 * double doubleValue()   返回大整数的double类型的值
 * float floatValue()   返回大整数的float类型的值
 * BigInteger gcd(BigInteger val)  返回大整数的最大公约数
 * int intValue() 返回大整数的整型值
 * long longValue() 返回大整数的long型值
 * BigInteger max(BigInteger val) 返回两个大整数的最大者
 * BigInteger min(BigInteger val) 返回两个大整数的最小者
 * BigInteger mod(BigInteger val) 用当前大整数对val求模
 * BigInteger multiply(BigInteger val) 返回两个大整数的积
 * BigInteger negate() 返回当前大整数的相反数
 * BigInteger not() 返回当前大整数的非
 * BigInteger or(BigInteger val) 返回两个大整数的按位或
 * <p>
 * BigInteger pow(int exponent) 返回当前大整数的exponent次方
 * BigInteger remainder(BigInteger val) 返回当前大整数除以val的余数
 * BigInteger leftShift(int n) 将当前大整数左移n位后返回
 * BigInteger rightShift(int n) 将当前大整数右移n位后返回
 * BigInteger subtract(BigInteger val)返回两个大整数相减的结果
 * <p>
 * byte[] toByteArray(BigInteger val)将大整数转换成二进制反码保存在byte数组中
 * String toString() 将当前大整数转换成十进制的字符串形式
 * BigInteger xor(BigInteger val) 返回两个大整数的异或
 **/
public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            BigInteger c = new BigInteger(a);
            BigInteger d = new BigInteger(b);
            System.out.println(c.add(d));
        }
        in.close();
    }
}








