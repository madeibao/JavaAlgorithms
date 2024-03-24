package com.basic.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @program: JavaWorkSpace2->InputBasicChar
 * @description: 输入一个基本字符
 * @author: MaYuan
 * @create: 2019-12-25 21:56
 * @version: 1.0
 **/
public class InputBasicChar {
    public static void main(String[] args) throws IOException {
        // 输入一个字符的内容。

        char c = (char) System.in.read();
        System.out.println(c);

        Scanner scc = new Scanner(System.in);
        //可以理解为接收一个字符串的第一个字符内容。
        char c2 = scc.next().charAt(0);
        //变成一个字符数组列表的第一个内容部分。
        char c3 = scc.next().toCharArray()[0];
        char c4 = (char) new BufferedReader(new InputStreamReader(System.in)).read();

        scc.close();
    }
}
