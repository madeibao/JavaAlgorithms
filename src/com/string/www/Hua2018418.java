package com.string.www;

import java.util.Scanner;

/**
 * @ClassName Hua2018418
 * @Author：Mayuan
 * @Date 2020/6/20 20:29
 * @Description TODO
 * @Version 1.0
 * <p>
 * 华为2018418笔试题题目。
 **/
public class Hua2018418 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {

            } else {
                //去掉数字
                sb.append(s.charAt(i));
            }
        }
        String r = splitString(sb.toString(), num);
        System.out.println(r);
    }

    /**
     * 首先是抛出异常。
     */
    public static String splitString(String str, int length) throws Exception {
        //无效输入
        if (str == null || str.length() < 1 || length < 1) {
            return "";
        }

        //用于统计这个字符串中有几个中文字符
        int wordCount = 0;
        //统一按照gbk编码来得到他的字节数组，因为不同的编码字节数组是不一样的。
        byte[] gbks = str.getBytes("GBK");

        //gbks中,汉字是两个负数表示
        for (int i = 0; i < length; i++) {
            int val = gbks[i];
            if (val < 0) {
                //汉字个数++  System.out.println(val);
                wordCount++;
            }
            System.out.println("wordcount " + wordCount);
        }

        //完整的汉字
        if (wordCount % 2 == 0) {
            return str.substring(0, (length - (wordCount / 2)));
        }
        //半个汉字 所以  -1
        return str.substring(0, (length - (wordCount / 2) - 1));
    }

}
