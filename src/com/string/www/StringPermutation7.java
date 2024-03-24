package com.string.www;

import java.util.Scanner;

/**
 * @ClassName StringPermutation7
 * @Author：Mayuan
 * @Date 2020/6/6 10:47
 * @Description TODO
 * @Version 1.0
 **/
public class StringPermutation7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        scanner.nextLine();
        StringBuilder input = new StringBuilder();
        for (int i = 0; i < lines; i++) {
            input.append(scanner.nextLine());
        }
        if (lines == 1) {
            System.out.println(input.substring(1, 2) + input.substring(0, 1));
            return;
        }
        char[] inputCharArray = input.toString().toCharArray();
        //一个字符串有多长
        int len = inputCharArray.length / lines;
        StringBuilder res = new StringBuilder();
        for (int j = 0; j < len; j++) {
            char temp = 0;
            for (int k = j; k < inputCharArray.length; k += len) {
                temp ^= inputCharArray[k];
            }
            res.append(temp);
        }
        System.out.println(res.toString());
    }
}
