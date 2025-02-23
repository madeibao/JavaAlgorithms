package com.Stream.www;

/**
 * @ClassName CharArrayToInt
 * @Author：Mayuan
 * @Date 2025/2/23/星期日 18:21
 * @Description TODO
 * @Version 1.0
 **/
public class CharArrayToInt {

    public static void main(String[] args) {

        char[] chs = new char[10];
        chs[0] = '0';
        chs[1] = '1';
        chs[2] = '2';
        chs[3] = '3';
        chs[4] = '4';
        chs[5] = '5';
        chs[6] = '6';
        chs[7] = '7';
        chs[8] = '8';
        chs[9] = '9';

        int[] nums = new String(chs).chars() // 将字符数组转换为字符流
                            .map(c -> c - '0') // 将字符转换为对应的整数值
                            .toArray(); // 将流转换为整型数组

        for(int i:nums) {
            System.out.println(i);
        }
    }
}
