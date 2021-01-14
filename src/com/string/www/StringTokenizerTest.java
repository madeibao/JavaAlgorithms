package com.string.www;

import java.util.StringTokenizer;

/**
 * @ClassName StringTokenizer
 * @Author：Mayuan
 * @Date 2020/7/4 15:56
 * @Description TODO
 * @Version 1.0
 **/
public class StringTokenizerTest {
    public static void main(String[] args) {
        String str = "runoob,google,taobao,facebook,zhihu";
        // 以 , 号为分隔符来分隔字符串
        StringTokenizer st = new StringTokenizer(str, ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
