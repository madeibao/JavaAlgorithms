package com.basic.www;

/**
 * @program: Pro1->BasicBinNum
 * @description: 基本的二进制文件
 * @author: MaYuan
 * @create: 2019-12-23 19:07
 * @version: 1.0
 **/
public class BasicBinNum {
    public static void main(String[] args) {
        int i = 0b00000000000000000000000000000001;
        System.out.println(i);
        int i2 = 0b0000_0000_0000_0000_0000_0000_0000_0001;
        System.out.println(i2);

        // 0x 开始的内容，代表的是16进制的写法。  2147483648
        long ab = 0x8000_0000L;
        System.out.println(ab);
    }
}



