package com.string.www;

/**
 * @program: JavaWorkSpace2->AlphaToLower
 * @description: 字母的大小写的转化
 * @author: MaYuan
 * @create: 2019-12-29 21:39
 * @version: 1.0
 * <p>
 * 分享个字母大小写转换的方法：
 * 统一转成大写：ch & 0b11011111 简写：ch & 0xDF
 * 统一转成小写：ch | 0b00100000 简写：ch | 0x20
 * 比较的时候注意加上小括号哦，因为位运算优先级比较低。
 **/
public class AlphaToLower {

    public static void main(String[] args) {
        char ch = 'a';
        // 变大写
        System.out.println((char) (ch & 0xDF));
    }
}



